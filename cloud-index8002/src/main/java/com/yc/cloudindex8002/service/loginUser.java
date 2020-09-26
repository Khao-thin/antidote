package com.yc.cloudindex8002.service;

import com.yc.cloudindex8002.bean.User;
import com.yc.cloudindex8002.mapper.loginMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class loginUser {
    @Resource
    loginMapper lm;

    public void loginUser(){
        List<User> user = lm.user();
        for (User user1 : user) {
            System.out.println(user1);
        }
    }

}
