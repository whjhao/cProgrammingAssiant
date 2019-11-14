package com.whjbatisgenerate.whj_batis_generate.controller;


import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;
import com.whjbatisgenerate.whj_batis_generate.service.impl.StudengtAllServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class HelloContrroller {
    @Autowired
    private StudengtAllServiceImpl studengtAllService;
//@ResponseBody

//    @RequestMapping("/success")
//    public String success(Map<String,Object> map){
//        map.put("jian1","<h1>用map穿了参</h1>");
//        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
//        return "success";
//    }
    @ResponseBody
    @RequestMapping("/duan")
    public void getAll(){

        Stuser stuser = new Stuser();
        stuser.setStuname("whj");
        stuser.setStuid(11);
        stuser.setPassword("11111");
        System.out.println(stuser);
        studengtAllService.insert(stuser);
        List<Stuser> stusers = studengtAllService.selectAll();
        for(Stuser stuser1:stusers){
            System.out.println(stuser1);
      }
    }
}
