package com.cn.bojue.srv.imp;

import com.cn.bojue.mapper.CanzhuoMapper;
import com.cn.bojue.pojo.Canzhuo;
import com.cn.bojue.service.CanzhuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 罗文 on 2017/5/14.
 */
@Service
public class CanzhuoServiceImpl implements CanzhuoService {

    @Autowired(required = false)
    private CanzhuoMapper canzhuoMapper;

    public Canzhuo selectByPrimaryKey(int id){
        return canzhuoMapper.selectByPrimaryKey(id);
    }

    public List<Canzhuo> selectByType(String type){
        List<Canzhuo> list =  canzhuoMapper.selectByType(type);
        return list;
    }
}
