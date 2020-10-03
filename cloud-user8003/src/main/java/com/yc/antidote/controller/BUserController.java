package com.yc.antidote.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.antidote.bean.AnUser;
import com.yc.antidote.bean.AnUserExample;
import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoArticleExample;
import com.yc.antidote.dao.AnUserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class BUserController {

    @Resource
    AnUserMapper amapper;

    @RequestMapping("bgetUser")
    public List<AnUser> bgetUser(int id){
        AnUserExample ae = new AnUserExample();
        ae.createCriteria().andIdEqualTo(id);
        return amapper.selectByExample(ae);
    }
}
