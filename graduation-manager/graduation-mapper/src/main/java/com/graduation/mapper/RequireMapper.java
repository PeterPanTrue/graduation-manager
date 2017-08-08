package com.graduation.mapper;

import com.graduation.pojo.Require;
import com.graduation.pojo.RequireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequireMapper {
    int countByExample(RequireExample example);

    int deleteByExample(RequireExample example);

    int deleteByPrimaryKey(Integer requireid);

    int insert(Require record);

    int insertSelective(Require record);

    List<Require> selectByExample(RequireExample example);

    Require selectByPrimaryKey(Integer requireid);

    int updateByExampleSelective(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByExample(@Param("record") Require record, @Param("example") RequireExample example);

    int updateByPrimaryKeySelective(Require record);

    int updateByPrimaryKey(Require record);
}