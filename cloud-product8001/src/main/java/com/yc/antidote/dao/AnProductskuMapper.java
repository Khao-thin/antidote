package com.yc.antidote.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnProductskuMapper {
    long countByExample(AnProductskuExample example);

    int deleteByExample(AnProductskuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnProductsku record);

    int insertSelective(AnProductsku record);

    List<AnProductsku> selectByExample(AnProductskuExample example);

    AnProductsku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnProductsku record, @Param("example") AnProductskuExample example);

    int updateByExample(@Param("record") AnProductsku record, @Param("example") AnProductskuExample example);

    int updateByPrimaryKeySelective(AnProductsku record);

    int updateByPrimaryKey(AnProductsku record);
}