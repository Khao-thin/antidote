package com.yc.cloudindex8002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class blogController {

    @RequestMapping(path = {"blog","blog.html"})
    public String blog(){
        return "blog";
    }

    @RequestMapping(path = {"blogDetail","blog-details.html"})
    public String blogdetails(){
        return "blog-details";
    }
}
