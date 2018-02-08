package com.dx.service.login.impl;

import com.dx.service.login.encryption.RSACoder;
import com.dx.service.login.pojo.MyUserDetails;
import com.dx.service.login.pojo.SysUser;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/** 认证拦截器
 * Created by Administrator on 2018-1-29.
 */
@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserService userService;

    /**
     * 自定义验证方式
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        System.out.println("user:"+username);
        try {
            username= RSACoder.decryptByPrivateKey(username,RSACoder.PrivateKey);
            password=RSACoder.decryptByPrivateKey(password,RSACoder.PrivateKey);
        } catch (Exception e) {

            //写log 日志
           // e.printStackTrace();
        }
        System.out.println("password:"+password);
        MyUserDetails user = (MyUserDetails) userService.loadUserByUsername(username);
        Md5PasswordEncoder md5PasswordEncoder=new Md5PasswordEncoder();
        password= md5PasswordEncoder.encodePassword(password, "salt");
        if(user == null){
            throw new BadCredentialsException("Username not found.");
        }

        if (!password.equals(user.getPassword())) {
            System.out.println("Wrong password.:"+username);
            throw new BadCredentialsException("Wrong password.");
        }
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}
