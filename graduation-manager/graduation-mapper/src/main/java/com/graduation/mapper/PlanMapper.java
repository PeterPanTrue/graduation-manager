package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Plan;
import com.graduation.pojo.PlanExample;

public interface PlanMapper {
    int countByExample(PlanExample example);

    int deleteByExample(PlanExample example);

    int deleteByPrimaryKey(Integer planid);

    int insert(Plan record);

    int insertSelective(Plan record);

    List<Plan> selectByExample(PlanExample example);
    
    List<Plan> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Plan selectByPrimaryKey(Integer planid);

    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);
}