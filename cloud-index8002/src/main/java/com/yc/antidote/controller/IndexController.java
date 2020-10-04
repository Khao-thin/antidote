package com.yc.antidote.controller;

import com.yc.antidote.bean.AnUser;
import com.yc.antidote.bean.Result;
import com.yc.antidote.controller.remote.IUserController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@SessionAttributes("loginedUser")
public class IndexController {
    @Resource
    IUserController iUserController;

    @GetMapping(path={"login.html","login"})
    public String tologin() {
        return "login";
    }

    @GetMapping(path={"register.html"})
    public String toreg() {
        return "register";
    }

    @GetMapping(path={"logout"})
    //SessionStatus用于终止会话
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "index";
    }

    @RequestMapping(path={"/","index.html"})
    public String index(Model m){
        return "index";
    }

    @PostMapping("login")
    public String login(@Valid AnUser user, Errors errors, Model m) {
        // 验证用户输入的数据是否正确
        if(errors.hasFieldErrors("account")||errors.hasFieldErrors("pwd")) {
            // 讲用户填写的数据传回页面
            m.addAttribute("user", user);
            m.addAttribute("errors",errors.getFieldError());
            return "login";
        }
        // 发起远程服务调用， 传递2个参数（用户名，密码）
        Result<AnUser> res= iUserController.login(user);
        // 根据返回的结果，如果正确跳转首页
        if(res.getStatus()==1) {
            /**
             * Feign 对于 Result.data 的类型, 如果data是Object类型, 会将其转为 LinkedHashMap
             * 		 使用泛型那么 Feign 就是正确转换类型
             */
            m.addAttribute("loginedUser", res.getData());
            return index(m);
        }else {
            // 自定义一个错误
            errors.rejectValue("account", "AccountOrPwdError","用户名或密码错误");
            m.addAttribute("errors", errors.getFieldError());
            // 如果错误，跳转回登录页
            return "login";
        }
    }
}