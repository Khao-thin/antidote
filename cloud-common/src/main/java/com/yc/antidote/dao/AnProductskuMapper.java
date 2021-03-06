package com.yc.antidote.dao;

import com.yc.antidote.bean.AnProductsku;
import com.yc.antidote.bean.AnProductskuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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