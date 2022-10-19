package com.seiken_soft.dao;

import com.seiken_soft.entity.TRoommember;
import com.seiken_soft.entity.TRoommemberExample;
import com.seiken_soft.entity.TRoommemberKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoommemberMapper {
    long countByExample(TRoommemberExample example);

    int deleteByExample(TRoommemberExample example);

    int deleteByPrimaryKey(TRoommemberKey key);

    int insert(TRoommember record);

    int insertSelective(TRoommember record);

    List<TRoommember> selectByExample(TRoommemberExample example);

    TRoommember selectByPrimaryKey(TRoommemberKey key);

    int updateByExampleSelective(@Param("record") TRoommember record, @Param("example") TRoommemberExample example);

    int updateByExample(@Param("record") TRoommember record, @Param("example") TRoommemberExample example);

    int updateByPrimaryKeySelective(TRoommember record);

    int updateByPrimaryKey(TRoommember record);
}