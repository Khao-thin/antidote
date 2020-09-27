package com.yc.clouduser8003.dao;

import com.yc.cloudcommon.bean.AnOrderitem;
import com.yc.cloudcommon.bean.AnOrderitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnOrderitemMapper {
    long countByExample(AnOrderitemExample example);

    int deleteByExample(AnOrderitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnOrderitem record);

    int insertSelective(AnOrderitem record);

    List<AnOrderitem> selectByExample(AnOrderitemExample example);

    AnOrderitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnOrderitem record, @Param("example") AnOrderitemExample example);

    int updateByExample(@Param("record") AnOrderitem record, @Param("example") AnOrderitemExample example);

    int updateByPrimaryKeySelective(AnOrderitem record);

    int updateByPrimaryKey(AnOrderitem record);
}