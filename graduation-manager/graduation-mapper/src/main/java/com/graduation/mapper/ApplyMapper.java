package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Apply;
import com.graduation.pojo.ApplyExample;

public interface ApplyMapper {
    int countByExample(ApplyExample example);

    int deleteByExample(ApplyExample example);

    int deleteByPrimaryKey(Integer employid);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);
    
    List<Apply> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);
    
    List<Apply> pageSelectByTemp(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows);

    Apply selectByPrimaryKey(Integer employid);

    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}