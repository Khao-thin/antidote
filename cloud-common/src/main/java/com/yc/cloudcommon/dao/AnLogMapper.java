package com.yc.cloudcommon.dao;

import com.yc.cloudcommon.bean.AnLog;
import com.yc.cloudcommon.bean.AnLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnLogMapper {
    long countByExample(AnLogExample example);

    int deleteByExample(AnLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnLog record);

    int insertSelective(AnLog record);

    List<AnLog> selectByExample(AnLogExample example);

    AnLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnLog record, @Param("example") AnLogExample example);

    int updateByExample(@Param("record") AnLog record, @Param("example") AnLogExample example);

    int updateByPrimaryKeySelective(AnLog record);

    int updateByPrimaryKey(AnLog record);
}