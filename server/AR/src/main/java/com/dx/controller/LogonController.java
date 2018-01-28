package com.dx.controller;

import com.dx.service.login.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by duxing on 2018/1/28.
 */
@Controller
public class LogonController {
    @Resource(name = "simpleLoginService")
    private LoginService simpleLoginService;

    @RequestMapping("/")
    public String index() {
        if (isLogin()) {
            return "index";
        }
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String user, String pwd) {
        simpleLoginService.login(user, pwd);
        return "fail";
    }

    @RequestMapping("/logout")
    public String logout(String user, String password) {
        return "login";
    }

    private boolean isLogin() {
        return false;
    }
}
