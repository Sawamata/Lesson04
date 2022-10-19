package com.seiken_soft.dao;

import com.seiken_soft.entity.TDuty;
import com.seiken_soft.entity.TDutyExample;
import com.seiken_soft.entity.TDutyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDutyMapper {
    long countByExample(TDutyExample example);

    int deleteByExample(TDutyExample example);

    int deleteByPrimaryKey(TDutyKey key);

    int insert(TDuty record);

    int insertSelective(TDuty record);

    List<TDuty> selectByExample(TDutyExample example);

    TDuty selectByPrimaryKey(TDutyKey key);

    int updateByExampleSelective(@Param("record") TDuty record, @Param("example") TDutyExample example);

    int updateByExample(@Param("record") TDuty record, @Param("example") TDutyExample example);

    int updateByPrimaryKeySelective(TDuty record);

    int updateByPrimaryKey(TDuty record);
}