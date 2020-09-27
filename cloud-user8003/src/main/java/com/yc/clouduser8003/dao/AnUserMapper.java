package com.yc.clouduser8003.dao;

import com.yc.cloudcommon.bean.AnUser;
import com.yc.cloudcommon.bean.AnUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnUserMapper {
    long countByExample(AnUserExample example);

    int deleteByExample(AnUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnUser record);

    int insertSelective(AnUser record);

    List<AnUser> selectByExample(AnUserExample example);

    AnUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnUser record, @Param("example") AnUserExample example);

    int updateByExample(@Param("record") AnUser record, @Param("example") AnUserExample example);

    int updateByPrimaryKeySelective(AnUser record);

    int updateByPrimaryKey(AnUser record);
}