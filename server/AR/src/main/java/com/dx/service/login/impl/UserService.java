package com.dx.service.login.impl;

import com.dx.data.mybatis.mapper.UserMapper;
import com.dx.service.login.pojo.MyUserDetails;
import com.dx.service.login.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018-1-29.
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("UserDetailsService");
        SysUser user = userMapper.getUserByLoginId(s);
        MyUserDetails u=new MyUserDetails(user);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        return u;
    }

}
