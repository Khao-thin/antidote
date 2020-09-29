package com.yc.cloudindex8002.controller.remote;

import com.yc.cloudcommon.bean.BoArticle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("anblog")
public interface IBlogController {

    @RequestMapping("blog/getArticles")
    List<BoArticle> getArticles();

}
