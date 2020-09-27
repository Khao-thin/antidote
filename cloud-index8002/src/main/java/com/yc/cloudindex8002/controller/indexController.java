package com.yc.cloudindex8002.controller;

import com.yc.cloudindex8002.service.loginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class indexController {
    @Resource
    loginUser lu;

    @RequestMapping(path={"login.html"})
    public String toLogin() { return "login"; }

    @PostMapping("login")
    public String login(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        lu.loginUser();
        return "index";
    }

    @PostMapping("register")
    public String register(String email,String emailword){
        return "index";
    }

    @RequestMapping(path={"shop.html","shop"})
    public String shop() { return "shop"; }

    @RequestMapping(path={"index.html","index"})
    public String index() { return "index"; }

    @RequestMapping(path={"blog.html","blog"})
    public String blog() { return "blog"; }

    @RequestMapping(path={"contact.html","contact"})
    public String contact() { return "contact"; }

    @RequestMapping(path={"about.html","about"})
    public String about() { return "about"; }



}