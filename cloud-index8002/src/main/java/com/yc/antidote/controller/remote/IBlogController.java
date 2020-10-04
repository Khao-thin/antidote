package com.yc.antidote.controller.remote;


import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoCategory;

import com.yc.antidote.bean.BoComment;
import com.yc.antidote.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("anblog")
public interface IBlogController {

    @RequestMapping("blog/getArticles")
    Object getArticles(@RequestParam(defaultValue = "1") int page);

    @RequestMapping("blog/getRecentArticles")
    List<BoArticle> getRecentArticles();

    @RequestMapping("blog/getCategory")
    List<BoCategory> getCategory();

    @RequestMapping("blog/getArticle")
    BoArticle getArticle(@RequestParam int id);

    @RequestMapping("blog/commShow")
    List<BoComment> commShow(@RequestParam int aid);

    @PostMapping("blog/comment")
    Result comment(@RequestBody BoComment bco);

}
