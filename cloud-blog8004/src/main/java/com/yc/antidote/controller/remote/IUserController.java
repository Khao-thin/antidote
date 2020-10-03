package com.yc.antidote.controller.remote;

import com.yc.antidote.bean.AnUser;
import com.yc.antidote.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@FeignClient("anuser")
public interface IUserController {


    @RequestMapping("user/bgetUser")
    List<AnUser> bgetUser(@RequestParam int id);
}
