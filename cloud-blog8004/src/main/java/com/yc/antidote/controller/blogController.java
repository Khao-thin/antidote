package com.yc.antidote.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoArticleExample;
import com.yc.antidote.bean.BoCategory;
import com.yc.antidote.dao.BoArticleMapper;

import com.yc.antidote.dao.BoCategoryMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("blog")
public class blogController {

    @Resource
    BoArticleMapper bam;

    @Resource
    BoCategoryMapper bcm;

    /**
     * 文章
     * @return
     */
    @RequestMapping("getArticles")
    public PageInfo<BoArticle> getArticles(@RequestParam(defaultValue = "1") int page){
        BoArticleExample bae = new BoArticleExample();
        bae.setOrderByClause("createtime desc");

        PageHelper.startPage(page,10);
        PageInfo<BoArticle> pageInfo = new PageInfo<BoArticle>( bam.selectByExample(bae));


        return pageInfo;
    }

    /**
     * 博客分类
     * @return
     */
    @RequestMapping("getCategory")
    public List<BoCategory> getCategory(){
        return bcm.selectByExample(null);
    }

}
