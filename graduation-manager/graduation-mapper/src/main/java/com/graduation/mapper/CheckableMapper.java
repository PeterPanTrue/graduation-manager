package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Checkable;
import com.graduation.pojo.CheckableExample;

public interface CheckableMapper {
    int countByExample(CheckableExample example);

    int deleteByExample(CheckableExample example);

    int deleteByPrimaryKey(Integer checkid);

    int insert(Checkable record);

    int insertSelective(Checkable record);

    List<Checkable> selectByExample(CheckableExample example);
    
    List<Checkable> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Checkable selectByPrimaryKey(Integer checkid);

    int updateByExampleSelective(@Param("record") Checkable record, @Param("example") CheckableExample example);

    int updateByExample(@Param("record") Checkable record, @Param("example") CheckableExample example);

    int updateByPrimaryKeySelective(Checkable record);

    int updateByPrimaryKey(Checkable record);
}