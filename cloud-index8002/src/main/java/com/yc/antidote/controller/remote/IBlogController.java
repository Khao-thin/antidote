package com.yc.antidote.controller.remote;


import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoCategory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("anblog")
public interface IBlogController {

    @RequestMapping("blog/getArticles")
    PageInfo<BoArticle> getArticles(@RequestParam(defaultValue = "1") int page);

    @RequestMapping("blog/getCategory")
    List<BoCategory> getCategory();

    @RequestMapping("blog/getArticle")
    BoArticle getArticle(@RequestParam int id);

}
