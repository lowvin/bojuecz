/**
 * Created by 罗文 on 2017/5/14.
 */
package com.cn.bojue.controller;

import com.cn.bojue.pojo.Canzhuo;
import com.cn.bojue.service.CanzhuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private CanzhuoService canzhuoService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Canzhuo getTestById(@RequestParam("id") String id) {
        return canzhuoService.selectByPrimaryKey(Integer.parseInt(id));
    }
    @RequestMapping(value = "/getIndex", method = RequestMethod.GET)
    @ResponseBody
    public Map  getIndex(){
        Map map = new HashMap();
        List<Canzhuo> list1 = canzhuoService.selectByType("dd");
        List<Canzhuo> list2 = canzhuoService.selectByType("sd");
        map.put("diandong",list1);
        map.put("shoudong",list2);
        return map;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView  index(){
        return new ModelAndView("model");
    }
    @RequestMapping(value = "/con", method = RequestMethod.POST)
    @ResponseBody
    public Map con( String czKind,String page){
        Map map = new HashMap();
        List<Canzhuo> list = null;
        int count = 0;
        if(czKind.equals("0")){
             list = canzhuoService.selectAll(Integer.valueOf(page));
             count = canzhuoService.selectCount("");
        }else{
             list = canzhuoService.selectByKind(czKind);
             count = canzhuoService.selectCount(czKind);
        }

        map.put("kind",list);
        map.put("total",count);
        return map;
    }
}