package com.yc.cloudindex8002.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping(path={"/404.html","404"})
    public String index(){
        return "404";
    }
}
