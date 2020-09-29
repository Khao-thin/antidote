package com.yc.antidote.dao;

import com.yc.antidote.bean.AnOrders;
import com.yc.antidote.bean.AnOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnOrdersMapper {
    long countByExample(AnOrdersExample example);

    int deleteByExample(AnOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnOrders record);

    int insertSelective(AnOrders record);

    List<AnOrders> selectByExample(AnOrdersExample example);

    AnOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnOrders record, @Param("example") AnOrdersExample example);

    int updateByExample(@Param("record") AnOrders record, @Param("example") AnOrdersExample example);

    int updateByPrimaryKeySelective(AnOrders record);

    int updateByPrimaryKey(AnOrders record);
}