package com.yc.antidote.controller;

import com.github.pagehelper.PageHelper;
import com.yc.antidote.dao.BoArticleMapper;
import com.yc.cloudcommon.bean.BoArticle;
import com.yc.cloudcommon.bean.BoArticleExample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("blog")
public class blogController {

    @Resource
    BoArticleMapper bam;

    @RequestMapping("getArticles")
    public List<BoArticle> getArticles(){
        BoArticleExample bae = new BoArticleExample();
        bae.setOrderByClause("createtime desc");

        PageHelper.startPage(1,10);
        return bam.selectByExample(bae);
    }

}
