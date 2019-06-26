package com.zb.demotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request){
        return "nihao";
    }

}
