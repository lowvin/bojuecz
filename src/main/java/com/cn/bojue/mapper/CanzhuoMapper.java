package com.cn.bojue.mapper;

import com.cn.bojue.pojo.Canzhuo;
import com.cn.bojue.pojo.CanzhuoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CanzhuoMapper {

    Canzhuo selectByPrimaryKey(Integer id);
    List<Canzhuo> selectByType(String type);
}