package com.yc.antidote.dao;

import com.yc.antidote.bean.BoCategory;
import com.yc.antidote.bean.BoCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoCategoryMapper {
    long countByExample(BoCategoryExample example);

    int deleteByExample(BoCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoCategory record);

    int insertSelective(BoCategory record);

    List<BoCategory> selectByExample(BoCategoryExample example);

    BoCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoCategory record, @Param("example") BoCategoryExample example);

    int updateByExample(@Param("record") BoCategory record, @Param("example") BoCategoryExample example);

    int updateByPrimaryKeySelective(BoCategory record);

    int updateByPrimaryKey(BoCategory record);
}