package com.yc.antidote.dao;

import com.yc.antidote.bean.AnPic;
import com.yc.antidote.bean.AnPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnPicMapper {
    long countByExample(AnPicExample example);

    int deleteByExample(AnPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnPic record);

    int insertSelective(AnPic record);

    List<AnPic> selectByExample(AnPicExample example);

    AnPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnPic record, @Param("example") AnPicExample example);

    int updateByExample(@Param("record") AnPic record, @Param("example") AnPicExample example);

    int updateByPrimaryKeySelective(AnPic record);

    int updateByPrimaryKey(AnPic record);
}