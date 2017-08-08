package com.graduation.mapper;

import com.graduation.pojo.Boon;
import com.graduation.pojo.BoonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoonMapper {
    int countByExample(BoonExample example);

    int deleteByExample(BoonExample example);

    int deleteByPrimaryKey(Integer boonid);

    int insert(Boon record);

    int insertSelective(Boon record);

    List<Boon> selectByExample(BoonExample example);

    Boon selectByPrimaryKey(Integer boonid);

    int updateByExampleSelective(@Param("record") Boon record, @Param("example") BoonExample example);

    int updateByExample(@Param("record") Boon record, @Param("example") BoonExample example);

    int updateByPrimaryKeySelective(Boon record);

    int updateByPrimaryKey(Boon record);
}