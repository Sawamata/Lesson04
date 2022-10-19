package com.seiken_soft.dao;

import com.seiken_soft.entity.MColor;
import com.seiken_soft.entity.MColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MColorMapper {
    long countByExample(MColorExample example);

    int deleteByExample(MColorExample example);

    int deleteByPrimaryKey(String colorCd);

    int insert(MColor record);

    int insertSelective(MColor record);

    List<MColor> selectByExample(MColorExample example);

    MColor selectByPrimaryKey(String colorCd);

    int updateByExampleSelective(@Param("record") MColor record, @Param("example") MColorExample example);

    int updateByExample(@Param("record") MColor record, @Param("example") MColorExample example);

    int updateByPrimaryKeySelective(MColor record);

    int updateByPrimaryKey(MColor record);
}