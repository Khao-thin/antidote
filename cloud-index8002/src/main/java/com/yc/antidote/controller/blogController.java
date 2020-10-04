package com.yc.antidote.controller;


import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.controller.remote.IBlogController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class blogController {

    @Resource
    IBlogController ibc;



    @RequestMapping(path = {"blog","blog.html"})
    public String blog(Model m,@RequestParam(defaultValue = "1") int page){
        m.addAttribute("Articles",ibc.getArticles(page));
        m.addAttribute("Category",ibc.getCategory() );
        return "blog";
    }

    @RequestMapping(path = {"blogtest","ooooo"})
    @ResponseBody
    public PageInfo<BoArticle> getq(@RequestParam(defaultValue = "1") int page){
        return (PageInfo<BoArticle>) ibc.getArticles(page);
    }

    @RequestMapping(path = {"blogDetail","blog-details.html"})
    public String blogdetails(Model m,@RequestParam int id){
        m.addAttribute("Article",ibc.getArticle(id));

        return "blog-details";
    }



}
