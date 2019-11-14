package com.whjbatisgenerate.whj_batis_generate.controller;

import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;
import com.whjbatisgenerate.whj_batis_generate.service.impl.StudengtAllServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    StudengtAllServiceImpl studengtAllService;
    @RequestMapping("/register")
    public String RegisterNewStu(){
        return "registerdata";
    }

//    学号：<input type="text" name="studentNum">
//    姓名：<input type="text" name="studentName">
//    密码：<input type="text" name="password">
    @RequestMapping("/addStudentByRegister")
    public String RegisterANewStudent(@RequestParam(name="studentNum") String studentNum,@RequestParam(name="studentName") String studentName,@RequestParam(name="password") String password){
        Stuser  stuser = new Stuser();
        Integer i;
        i = Integer.valueOf(studentNum);
        System.out.println(studentName+studentNum+password);
        stuser.setStuid(i);
        stuser.setPassword(password);
        stuser.setStuname(studentName);
        studengtAllService.insert(stuser);
        return "registersuccess";
    }

}
