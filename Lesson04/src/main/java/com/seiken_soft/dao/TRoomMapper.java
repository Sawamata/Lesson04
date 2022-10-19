package com.seiken_soft.dao;

import com.seiken_soft.entity.TRoom;
import com.seiken_soft.entity.TRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRoomMapper {
    long countByExample(TRoomExample example);

    int deleteByExample(TRoomExample example);

    int deleteByPrimaryKey(String roomNumber);

    int insert(TRoom record);

    int insertSelective(TRoom record);

    List<TRoom> selectByExample(TRoomExample example);

    TRoom selectByPrimaryKey(String roomNumber);

    int updateByExampleSelective(@Param("record") TRoom record, @Param("example") TRoomExample example);

    int updateByExample(@Param("record") TRoom record, @Param("example") TRoomExample example);

    int updateByPrimaryKeySelective(TRoom record);

    int updateByPrimaryKey(TRoom record);
}