package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Reword;
import com.graduation.pojo.RewordExample;

public interface RewordMapper {
    int countByExample(RewordExample example);

    int deleteByExample(RewordExample example);

    int deleteByPrimaryKey(Integer rewordid);

    int insert(Reword record);

    int insertSelective(Reword record);

    List<Reword> selectByExample(RewordExample example);
    
    List<Reword> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Reword selectByPrimaryKey(Integer rewordid);

    int updateByExampleSelective(@Param("record") Reword record, @Param("example") RewordExample example);

    int updateByExample(@Param("record") Reword record, @Param("example") RewordExample example);

    int updateByPrimaryKeySelective(Reword record);

    int updateByPrimaryKey(Reword record);
}