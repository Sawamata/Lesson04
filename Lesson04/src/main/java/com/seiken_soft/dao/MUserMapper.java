package com.seiken_soft.dao;

import com.seiken_soft.entity.MUser;
import com.seiken_soft.entity.MUserExample;
import com.seiken_soft.entity.MUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserMapper {
    long countByExample(MUserExample example);

    int deleteByExample(MUserExample example);

    int deleteByPrimaryKey(String employeeId);

    int insert(MUserWithBLOBs record);

    int insertSelective(MUserWithBLOBs record);

    List<MUserWithBLOBs> selectByExampleWithBLOBs(MUserExample example);

    List<MUser> selectByExample(MUserExample example);

    MUserWithBLOBs selectByPrimaryKey(String employeeId);

    int updateByExampleSelective(@Param("record") MUserWithBLOBs record, @Param("example") MUserExample example);

    int updateByExampleWithBLOBs(@Param("record") MUserWithBLOBs record, @Param("example") MUserExample example);

    int updateByExample(@Param("record") MUser record, @Param("example") MUserExample example);

    int updateByPrimaryKeySelective(MUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MUserWithBLOBs record);

    int updateByPrimaryKey(MUser record);
}