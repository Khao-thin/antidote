package com.yc.antidote.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnSizeMapper {
    long countByExample(AnSizeExample example);

    int deleteByExample(AnSizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnSize record);

    int insertSelective(AnSize record);

    List<AnSize> selectByExample(AnSizeExample example);

    AnSize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnSize record, @Param("example") AnSizeExample example);

    int updateByExample(@Param("record") AnSize record, @Param("example") AnSizeExample example);

    int updateByPrimaryKeySelective(AnSize record);

    int updateByPrimaryKey(AnSize record);
}