package com.yc.cloudindex8002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping(path={"login.html"})
    public String toLogin() { return "login"; }

    @PostMapping("login")
    public String login(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "index";
    }

    @PostMapping("register")
    public String register(String email,String emailword){
        return "index";
    }

    @RequestMapping(path={"shop.html","shop"})
    public String shop() { return "shop"; }

}