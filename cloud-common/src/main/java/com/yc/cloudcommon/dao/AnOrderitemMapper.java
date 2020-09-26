package com.yc.cloudcommon.dao;

import com.yc.cloudcommon.bean.AnOrderitem;
import com.yc.cloudcommon.bean.AnOrderitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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