package com.whjbatisgenerate.whj_batis_generate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestChoiceController {
    @RequestMapping("/choose-the-test")
    public String gotoTestNumChoice(Map<String,String> map, String inputXuehao,
                                    String password){
        System.out.println(inputXuehao+password);

        map.put("xuehao",inputXuehao);
        map.put("password",password);
        return "choosetest";

    }
}
