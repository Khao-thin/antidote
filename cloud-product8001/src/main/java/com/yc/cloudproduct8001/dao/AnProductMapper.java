package com.yc.cloudproduct8001.dao;

import com.yc.cloudcommon.bean.AnProduct;
import com.yc.cloudcommon.bean.AnProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnProductMapper {
    long countByExample(AnProductExample example);

    int deleteByExample(AnProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnProduct record);

    int insertSelective(AnProduct record);

    List<AnProduct> selectByExampleWithBLOBs(AnProductExample example);

    List<AnProduct> selectByExample(AnProductExample example);

    AnProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnProduct record, @Param("example") AnProductExample example);

    int updateByExampleWithBLOBs(@Param("record") AnProduct record, @Param("example") AnProductExample example);

    int updateByExample(@Param("record") AnProduct record, @Param("example") AnProductExample example);

    int updateByPrimaryKeySelective(AnProduct record);

    int updateByPrimaryKeyWithBLOBs(AnProduct record);

    int updateByPrimaryKey(AnProduct record);
}