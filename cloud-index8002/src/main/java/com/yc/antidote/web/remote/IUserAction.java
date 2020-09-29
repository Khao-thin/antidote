package com.yc.antidote.web.remote;

import com.yc.antidote.bean.AnUser;
import com.yc.antidote.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient("anuser")
public interface IUserAction {
    /**
     * Feigin 要求对象参数标注 @RequestBody 注解
     * @param anUser
     */
    @PostMapping("user/login")
    Result<AnUser> login(@RequestBody @Valid AnUser anUser);

    @PostMapping("user/register")
    Result<AnUser> register(@RequestBody AnUser anUser);

    //@GetMapping("cart/findByUid")
   // List<CrCart> findByUid(@RequestParam Integer id);
}
