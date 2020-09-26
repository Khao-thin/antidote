package com.yc.cloudindex8002.mapper;

import com.yc.cloudindex8002.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface loginMapper {
    @Select("select * from bo_user")
    List<User> user();

}
