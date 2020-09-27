package com.yc.clouduser8003.dao;

import com.yc.cloudcommon.bean.AnAddr;
import com.yc.cloudcommon.bean.AnAddrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnAddrMapper {
    long countByExample(AnAddrExample example);

    int deleteByExample(AnAddrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnAddr record);

    int insertSelective(AnAddr record);

    List<AnAddr> selectByExample(AnAddrExample example);

    AnAddr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnAddr record, @Param("example") AnAddrExample example);

    int updateByExample(@Param("record") AnAddr record, @Param("example") AnAddrExample example);

    int updateByPrimaryKeySelective(AnAddr record);

    int updateByPrimaryKey(AnAddr record);
}