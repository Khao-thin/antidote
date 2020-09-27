package com.yc.cloudindex8002.web.remote;

import com.yc.cloudcommon.bean.AnUser;
import com.yc.cloudcommon.bean.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("anuser")
public interface IUserAction {
    /**
     * Feigin 要求对象参数标注 @RequestBody 注解
     */
    @PostMapping("user/login")
    Result<AnUser> login(@RequestBody AnUser anUser);

    @PostMapping("user/register")
    Result<AnUser> register(@RequestBody AnUser anUser);

    //@GetMapping("cart/findByUid")
   // List<CrCart> findByUid(@RequestParam Integer id);
}
