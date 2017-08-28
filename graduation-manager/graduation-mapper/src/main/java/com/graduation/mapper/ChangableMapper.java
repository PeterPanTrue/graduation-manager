package com.graduation.mapper;

import com.graduation.pojo.Changable;
import com.graduation.pojo.ChangableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangableMapper {
    int countByExample(ChangableExample example);

    int deleteByExample(ChangableExample example);

    int deleteByPrimaryKey(Integer changeid);

    int insert(Changable record);

    int insertSelective(Changable record);

    List<Changable> selectByExample(ChangableExample example);
    
    List<Changable> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Changable selectByPrimaryKey(Integer changeid);

    int updateByExampleSelective(@Param("record") Changable record, @Param("example") ChangableExample example);

    int updateByExample(@Param("record") Changable record, @Param("example") ChangableExample example);

    int updateByPrimaryKeySelective(Changable record);

    int updateByPrimaryKey(Changable record);
}