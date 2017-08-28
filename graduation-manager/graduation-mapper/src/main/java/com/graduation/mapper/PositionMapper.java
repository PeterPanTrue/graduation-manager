package com.graduation.mapper;

import com.graduation.pojo.Position;
import com.graduation.pojo.PositionExample;
import com.graduation.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    int countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);
    
    List<Position> pageSelect(@Param("id") Integer id, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);
    
    List<Position> pageSelectByDepartment(@Param("id") Integer id, @Param("department") String department,@Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);
    
    Position selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}