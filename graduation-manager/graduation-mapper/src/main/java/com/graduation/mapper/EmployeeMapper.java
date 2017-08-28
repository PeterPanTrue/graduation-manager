package com.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.graduation.pojo.Employee;
import com.graduation.pojo.EmployeeExample;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    
    List<Employee> pageSelect(@Param("id") Integer id,@Param("department") String department, @Param("page") Integer  page, @Param("rows") Integer  rows,@Param("sort") String  sort, @Param("order") String  order);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}