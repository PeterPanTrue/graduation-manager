package com.graduation.mapper;

import com.graduation.pojo.Announce;
import com.graduation.pojo.AnnounceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnounceMapper {
    int countByExample(AnnounceExample example);

    int deleteByExample(AnnounceExample example);

    int deleteByPrimaryKey(Integer announceid);

    int insert(Announce record);

    int insertSelective(Announce record);

    List<Announce> selectByExample(AnnounceExample example);

    Announce selectByPrimaryKey(Integer announceid);

    int updateByExampleSelective(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExample(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKey(Announce record);
}