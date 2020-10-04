package com.yc.antidote.controller;


import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoComment;
import com.yc.antidote.bean.Result;
import com.yc.antidote.controller.remote.IBlogController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class blogController {

    @Resource
    IBlogController ibc;



    @RequestMapping(path = {"blog","blog.html"})
    public String blog(Model m,@RequestParam(defaultValue = "1") int page){
        m.addAttribute("Articles",ibc.getArticles(page));
        m.addAttribute("Category",ibc.getCategory() );
        m.addAttribute("RArticles",ibc.getRecentArticles() );
        return "blog";
    }

    @RequestMapping(path = {"blogtest"})
    @ResponseBody
    public List<BoArticle> getq(@RequestParam(defaultValue = "1") int page){
        return ibc.getRecentArticles();
    }

    @RequestMapping(path = {"blogDetail","blog-details.html"})
    public String blogdetails(Model m,@RequestParam int id){
        m.addAttribute("Article",ibc.getArticle(id));

        return "blog-details";
    }

    @RequestMapping("commShow")
    @ResponseBody
    public Result commShow(@RequestParam int aid){

        return new Result<>(1,"",ibc.commShow(aid));
    }

    @PostMapping("comment")
    @ResponseBody
    public Result comment(BoComment bco){
        bco.setCreateby(1);
        return ibc.comment( bco);
    }



}
