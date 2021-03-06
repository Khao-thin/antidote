package com.yc.antidote;

import com.yc.antidote.bean.BoArticle;
import com.yc.antidote.bean.BoArticleExample;
import com.yc.antidote.dao.BoArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CloudBlog8004ApplicationTests {

    @Resource
    BoArticleMapper bam;

    @Test
    void contextLoads() {

        BoArticleExample bae = new BoArticleExample();
        bae.setOrderByClause("createtime desc");
        List<BoArticle> list = bam.selectByExample(null);

    }

}
