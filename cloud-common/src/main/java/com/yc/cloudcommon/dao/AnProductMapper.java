package com.yc.cloudcommon.dao;

import com.yc.cloudcommon.bean.AnProduct;
import com.yc.cloudcommon.bean.AnProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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