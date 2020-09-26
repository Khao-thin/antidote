package com.yc.cloudcommon.dao;

import com.yc.cloudcommon.bean.BoCategory;
import com.yc.cloudcommon.bean.BoCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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