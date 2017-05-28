package com.cn.bojue.service;

import com.cn.bojue.pojo.Canzhuo;

import java.util.List;

/**
 * Created by 罗文 on 2017/5/14.
 */
public interface CanzhuoService {
    Canzhuo selectByPrimaryKey(int id);
    List<Canzhuo> selectByType(String type);
}
