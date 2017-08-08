package com.graduation.mapper;

import com.graduation.pojo.Check;
import com.graduation.pojo.CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckMapper {
    int countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int deleteByPrimaryKey(Integer checkid);

    int insert(Check record);

    int insertSelective(Check record);

    List<Check> selectByExample(CheckExample example);

    Check selectByPrimaryKey(Integer checkid);

    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}