package com.dx.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018-2-2.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/rest")
    public  String test(){
        return "rset!!!!";
    }
}
