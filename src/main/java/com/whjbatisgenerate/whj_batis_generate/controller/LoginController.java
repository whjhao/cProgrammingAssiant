package com.whjbatisgenerate.whj_batis_generate.controller;


import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;
import com.whjbatisgenerate.whj_batis_generate.service.impl.StudengtAllServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
@Autowired
    StudengtAllServiceImpl studengtAllService;
    @RequestMapping("/hello")
    public String Ghello(){
        return "login";
    }

    @RequestMapping("/checksudent")
    public String BoolLogin(@RequestParam(name="inputXuehao")String xuehao,@RequestParam(name="password") String password,Model model){

        Integer stuid;
        stuid = Integer.valueOf(xuehao);
        Stuser stuser = studengtAllService.selectByPrimaryKey(stuid);
        if(stuser.getPassword().equals(password)){

            model.addAttribute("length",5);
            return "quiz/selectfromquizs";
        }else {
            return "error/loginerror";
        }
    }

}

