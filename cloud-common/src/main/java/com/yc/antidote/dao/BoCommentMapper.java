package com.yc.antidote.dao;

import com.yc.antidote.bean.BoComment;
import com.yc.antidote.bean.BoCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoCommentMapper {
    long countByExample(BoCommentExample example);

    int deleteByExample(BoCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoComment record);

    int insertSelective(BoComment record);

    List<BoComment> selectByExample(BoCommentExample example);

    BoComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoComment record, @Param("example") BoCommentExample example);

    int updateByExample(@Param("record") BoComment record, @Param("example") BoCommentExample example);

    int updateByPrimaryKeySelective(BoComment record);

    int updateByPrimaryKey(BoComment record);
}