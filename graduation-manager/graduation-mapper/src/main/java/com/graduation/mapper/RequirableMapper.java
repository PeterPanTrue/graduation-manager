package com.graduation.mapper;

import com.graduation.pojo.Requirable;
import com.graduation.pojo.RequirableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequirableMapper {
    int countByExample(RequirableExample example);

    int deleteByExample(RequirableExample example);

    int deleteByPrimaryKey(Integer requireid);

    int insert(Requirable record);

    int insertSelective(Requirable record);

    List<Requirable> selectByExample(RequirableExample example);
    
    List<Requirable> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Requirable selectByPrimaryKey(Integer requireid);

    int updateByExampleSelective(@Param("record") Requirable record, @Param("example") RequirableExample example);

    int updateByExample(@Param("record") Requirable record, @Param("example") RequirableExample example);

    int updateByPrimaryKeySelective(Requirable record);

    int updateByPrimaryKey(Requirable record);
}