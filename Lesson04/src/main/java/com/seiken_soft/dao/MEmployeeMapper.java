package com.seiken_soft.dao;

import com.seiken_soft.entity.MEmployee;
import com.seiken_soft.entity.MEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MEmployeeMapper {
    long countByExample(MEmployeeExample example);

    int deleteByExample(MEmployeeExample example);

    int deleteByPrimaryKey(String employeeId);

    int insert(MEmployee record);

    int insertSelective(MEmployee record);

    List<MEmployee> selectByExample(MEmployeeExample example);

    MEmployee selectByPrimaryKey(String employeeId);

    int updateByExampleSelective(@Param("record") MEmployee record, @Param("example") MEmployeeExample example);

    int updateByExample(@Param("record") MEmployee record, @Param("example") MEmployeeExample example);

    int updateByPrimaryKeySelective(MEmployee record);

    int updateByPrimaryKey(MEmployee record);
}