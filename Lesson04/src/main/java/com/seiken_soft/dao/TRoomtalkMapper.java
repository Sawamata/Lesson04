package com.seiken_soft.dao;

import com.seiken_soft.entity.TRoomtalk;
import com.seiken_soft.entity.TRoomtalkExample;
import com.seiken_soft.entity.TRoomtalkKey;
import com.seiken_soft.entity.TRoomtalkWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoomtalkMapper {
    long countByExample(TRoomtalkExample example);

    int deleteByExample(TRoomtalkExample example);

    int deleteByPrimaryKey(TRoomtalkKey key);

    int insert(TRoomtalkWithBLOBs record);

    int insertSelective(TRoomtalkWithBLOBs record);

    List<TRoomtalkWithBLOBs> selectByExampleWithBLOBs(TRoomtalkExample example);

    List<TRoomtalk> selectByExample(TRoomtalkExample example);

    TRoomtalkWithBLOBs selectByPrimaryKey(TRoomtalkKey key);

    int updateByExampleSelective(@Param("record") TRoomtalkWithBLOBs record, @Param("example") TRoomtalkExample example);

    int updateByExampleWithBLOBs(@Param("record") TRoomtalkWithBLOBs record, @Param("example") TRoomtalkExample example);

    int updateByExample(@Param("record") TRoomtalk record, @Param("example") TRoomtalkExample example);

    int updateByPrimaryKeySelective(TRoomtalkWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TRoomtalkWithBLOBs record);

    int updateByPrimaryKey(TRoomtalk record);
}