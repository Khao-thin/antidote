package com.yc.cloudcommon.dao;

import com.yc.cloudcommon.bean.BoArticle;
import com.yc.cloudcommon.bean.BoArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoArticleMapper {
    long countByExample(BoArticleExample example);

    int deleteByExample(BoArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoArticle record);

    int insertSelective(BoArticle record);

    List<BoArticle> selectByExampleWithBLOBs(BoArticleExample example);

    List<BoArticle> selectByExample(BoArticleExample example);

    BoArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoArticle record, @Param("example") BoArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") BoArticle record, @Param("example") BoArticleExample example);

    int updateByExample(@Param("record") BoArticle record, @Param("example") BoArticleExample example);

    int updateByPrimaryKeySelective(BoArticle record);

    int updateByPrimaryKeyWithBLOBs(BoArticle record);

    int updateByPrimaryKey(BoArticle record);
}