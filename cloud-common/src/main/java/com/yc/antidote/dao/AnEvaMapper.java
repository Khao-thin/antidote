package com.yc.antidote.dao;

import com.yc.antidote.bean.AnEva;
import com.yc.antidote.bean.AnEvaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnEvaMapper {
    long countByExample(AnEvaExample example);

    int deleteByExample(AnEvaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnEva record);

    int insertSelective(AnEva record);

    List<AnEva> selectByExample(AnEvaExample example);

    AnEva selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnEva record, @Param("example") AnEvaExample example);

    int updateByExample(@Param("record") AnEva record, @Param("example") AnEvaExample example);

    int updateByPrimaryKeySelective(AnEva record);

    int updateByPrimaryKey(AnEva record);
}