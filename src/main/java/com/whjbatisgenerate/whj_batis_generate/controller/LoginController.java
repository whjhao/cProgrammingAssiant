package com.whjbatisgenerate.whj_batis_generate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/hello")
    public String Ghello(){
        return "login";
    }

}

