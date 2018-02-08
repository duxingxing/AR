package com.dx.controller;

import com.dx.service.login.pojo.RightGrantedAuthority;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by duxing on 2018/1/28.
 */
@Controller
public class LogonController {

    @RequestMapping("/index")
    public String index() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "ilogin";
    }
    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('artery')")//拥有admin 权限可以访问 hasRole() hasAuthority
    public String hello() {
        Collection<RightGrantedAuthority> c= (Collection<RightGrantedAuthority> )SecurityContextHolder.getContext().getAuthentication().getAuthorities();
      //  SecurityContextHolder.getContext().getAuthentication().
        return "hello";
    }

    /**
     * 拥有role 角色可以访问
     * @return
     */
    @RequestMapping("/role")
    @PreAuthorize("hasRole('role')")//拥有admin 权限可以访问 hasRole() hasAuthority
    public String role() {
        Collection<RightGrantedAuthority> c= (Collection<RightGrantedAuthority> )SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        //  SecurityContextHolder.getContext().getAuthentication().
        return "hello";
    }
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
//    public String login(String user, String pwd) {

//        return "fail";
//    }


}
