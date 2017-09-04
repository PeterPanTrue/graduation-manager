package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Boon;
import com.graduation.pojo.BoonExample;

public interface BoonMapper {
    int countByExample(BoonExample example);

    int deleteByExample(BoonExample example);

    int deleteByPrimaryKey(Integer boonid);

    int insert(Boon record);

    int insertSelective(Boon record);

    List<Boon> selectByExample(BoonExample example);
    
    List<Boon> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Boon selectByPrimaryKey(Integer boonid);

    int updateByExampleSelective(@Param("record") Boon record, @Param("example") BoonExample example);

    int updateByExample(@Param("record") Boon record, @Param("example") BoonExample example);

    int updateByPrimaryKeySelective(Boon record);

    int updateByPrimaryKey(Boon record);
}