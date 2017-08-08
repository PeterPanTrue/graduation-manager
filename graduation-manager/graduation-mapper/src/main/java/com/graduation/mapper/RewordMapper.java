package com.graduation.mapper;

import com.graduation.pojo.Reword;
import com.graduation.pojo.RewordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewordMapper {
    int countByExample(RewordExample example);

    int deleteByExample(RewordExample example);

    int deleteByPrimaryKey(Integer rewordid);

    int insert(Reword record);

    int insertSelective(Reword record);

    List<Reword> selectByExample(RewordExample example);

    Reword selectByPrimaryKey(Integer rewordid);

    int updateByExampleSelective(@Param("record") Reword record, @Param("example") RewordExample example);

    int updateByExample(@Param("record") Reword record, @Param("example") RewordExample example);

    int updateByPrimaryKeySelective(Reword record);

    int updateByPrimaryKey(Reword record);
}