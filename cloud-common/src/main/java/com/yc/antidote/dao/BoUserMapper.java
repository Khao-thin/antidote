package com.yc.antidote.dao;

import com.yc.antidote.bean.BoUser;
import com.yc.antidote.bean.BoUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoUserMapper {
    long countByExample(BoUserExample example);

    int deleteByExample(BoUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoUser record);

    int insertSelective(BoUser record);

    List<BoUser> selectByExample(BoUserExample example);

    BoUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoUser record, @Param("example") BoUserExample example);

    int updateByExample(@Param("record") BoUser record, @Param("example") BoUserExample example);

    int updateByPrimaryKeySelective(BoUser record);

    int updateByPrimaryKey(BoUser record);
}