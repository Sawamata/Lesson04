package com.seiken_soft.dao;

import com.seiken_soft.entity.TPasswordHistory;
import com.seiken_soft.entity.TPasswordHistoryExample;
import com.seiken_soft.entity.TPasswordHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPasswordHistoryMapper {
    long countByExample(TPasswordHistoryExample example);

    int deleteByExample(TPasswordHistoryExample example);

    int deleteByPrimaryKey(TPasswordHistoryKey key);

    int insert(TPasswordHistory record);

    int insertSelective(TPasswordHistory record);

    List<TPasswordHistory> selectByExampleWithBLOBs(TPasswordHistoryExample example);

    List<TPasswordHistory> selectByExample(TPasswordHistoryExample example);

    TPasswordHistory selectByPrimaryKey(TPasswordHistoryKey key);

    int updateByExampleSelective(@Param("record") TPasswordHistory record, @Param("example") TPasswordHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") TPasswordHistory record, @Param("example") TPasswordHistoryExample example);

    int updateByExample(@Param("record") TPasswordHistory record, @Param("example") TPasswordHistoryExample example);

    int updateByPrimaryKeySelective(TPasswordHistory record);

    int updateByPrimaryKeyWithBLOBs(TPasswordHistory record);

    int updateByPrimaryKey(TPasswordHistory record);
}