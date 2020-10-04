package com.yc.antidote.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.*;
import com.yc.antidote.controller.remote.IUserController;
import com.yc.antidote.dao.BoArticleMapper;
import com.yc.antidote.dao.BoCategoryMapper;
import com.yc.antidote.dao.BoCommentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("blog")
public class blogController {

    @Resource
    BoArticleMapper bam;

    @Resource
    BoCategoryMapper bcm;

    @Resource
    IUserController iuc;

    @Resource
    BoCommentMapper bcom;

    /**
     * 文章list
     * @return
     */
    @RequestMapping("getArticles")
    public PageInfo<BoArticle> getArticles(@RequestParam(defaultValue = "1") int page){
        BoArticleExample bae = new BoArticleExample();
        bae.setOrderByClause("createtime desc");
        PageHelper.startPage(page,10);
        List<BoArticle> list = bam.selectByExample(bae);
        for(Iterator<BoArticle> it = list.iterator(); it.hasNext();){
            BoArticle article = it.next();
            article.setAuthor(iuc.bgetUser(Integer.parseInt(article.getAuthor())).get(0).getName());
        }
        PageInfo<BoArticle> pageInfo = new PageInfo<BoArticle>( list);


        return pageInfo;
    }

    /**
     * 最近文章
     * @return
     */
    @RequestMapping("getRecentArticles")
    public List<BoArticle> getRecentArticles(){
        BoArticleExample bae = new BoArticleExample();
        bae.setOrderByClause("createtime desc");
        PageHelper.startPage(1,4);
        return bam.selectByExample(bae);
    }
    /**
     * 博客分类
     * @return
     */
    @RequestMapping("getCategory")
    public List<BoCategory> getCategory(){
        return bcm.selectByExample(null);
    }

    /**
     * 文章详情
     * @param id
     * @return
     */
    @RequestMapping("getArticle")
    public BoArticle getArticle(@RequestParam int id){
        BoArticle boArticle = bam.selectByPrimaryKey(id);
        boArticle.setAuthor(iuc.bgetUser(Integer.parseInt(boArticle.getAuthor())).get(0).getName());
        return boArticle;
    }

    /**
     * 评论显示
     * @param aid
     * @return
     */
    @RequestMapping("commShow")
    public List<BoComment> commShow(@RequestParam int aid){
        BoCommentExample bce = new BoCommentExample();
        bce.createCriteria().andArticleidEqualTo(aid);
        List<BoComment> list = bcom.selectByExample(bce);
        for(Iterator<BoComment> it = list.iterator(); it.hasNext();){
            BoComment boComment = it.next();
            AnUser anUser = iuc.bgetUser(boComment.getCreateby()).get(0);
            boComment.setAuthor(anUser.getName());
            boComment.setHead(anUser.getHead());
        }
        return list;
    }

    @PostMapping("comment")
    public Result comment(@RequestBody BoComment bco){
        AnUser anUser = iuc.bgetUser(bco.getCreateby()).get(0);
        bco.setAuthor(anUser.getName());
        bco.setHead(anUser.getHead());
        bco.setCreatetime(new Date());
        int re = bcom.insert(bco);
        if(re==0){
            return new Result(0,"评论失败",bco);
        }else {
            return new Result(1,"评论成功",bco);
        }
    }

}
