package com.yc.cloudzuul80;

import com.yc.antidote.controller.remote.IBlogController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CloudIndex8002ApplicationTests {

    @Resource
    IBlogController ibc;
    @Test
    void contextLoads() {
//        ibc.getArticles();
    }

}
