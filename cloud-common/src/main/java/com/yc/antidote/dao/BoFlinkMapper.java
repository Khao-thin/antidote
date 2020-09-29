package com.yc.antidote.dao;

import com.yc.antidote.bean.BoFlink;
import com.yc.antidote.bean.BoFlinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoFlinkMapper {
    long countByExample(BoFlinkExample example);

    int deleteByExample(BoFlinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoFlink record);

    int insertSelective(BoFlink record);

    List<BoFlink> selectByExample(BoFlinkExample example);

    BoFlink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoFlink record, @Param("example") BoFlinkExample example);

    int updateByExample(@Param("record") BoFlink record, @Param("example") BoFlinkExample example);

    int updateByPrimaryKeySelective(BoFlink record);

    int updateByPrimaryKey(BoFlink record);
}