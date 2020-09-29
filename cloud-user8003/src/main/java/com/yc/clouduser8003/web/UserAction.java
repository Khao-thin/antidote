package com.yc.clouduser8003.web;

import com.yc.cloudcommon.bean.AnUser;
import com.yc.cloudcommon.bean.AnUserExample;
import com.yc.cloudcommon.bean.Result;
import com.yc.clouduser8003.dao.AnUserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserAction {
    @Resource
    AnUserMapper anUserMapper;

    @PostMapping("login")
    public Result<AnUser> login(@RequestBody AnUser anUser){//@requestBody User user 这种形式会将JSON字符串中的值赋予user中对应的属性上
        AnUserExample anUserExample=new AnUserExample();
        anUserExample.createCriteria().andAccountEqualTo(anUser.getAccount()).andPwdEqualTo(anUser.getPwd());
        List<AnUser> anUsers = anUserMapper.selectByExample(anUserExample);
        if (anUsers.isEmpty()){
            return new Result<>(0,"用户名或密码错误");
        }else return new Result<>(1,"登陆成功");
    }

    @PostMapping("register")
    public Result<AnUser> register(@RequestBody AnUser anUser){
        // 带 Selective 的insert 是动态生成 字段, 非 null 字段才会参与 insert
        anUserMapper.insertSelective(anUser);
        return new Result<>(1,"注册成功",anUser);
    }
}