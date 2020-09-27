package com.yc.cloudproduct8001.dao;

import com.yc.cloudcommon.bean.AnCategory;
import com.yc.cloudcommon.bean.AnCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnCategoryMapper {
    long countByExample(AnCategoryExample example);

    int deleteByExample(AnCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnCategory record);

    int insertSelective(AnCategory record);

    List<AnCategory> selectByExample(AnCategoryExample example);

    AnCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnCategory record, @Param("example") AnCategoryExample example);

    int updateByExample(@Param("record") AnCategory record, @Param("example") AnCategoryExample example);

    int updateByPrimaryKeySelective(AnCategory record);

    int updateByPrimaryKey(AnCategory record);
}