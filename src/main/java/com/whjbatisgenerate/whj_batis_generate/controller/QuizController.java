package com.whjbatisgenerate.whj_batis_generate.controller;

import com.whjbatisgenerate.whj_batis_generate.entity.Testpapertb;
import com.whjbatisgenerate.whj_batis_generate.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuizController {
@Autowired
TestPaperService testPaperService;
    @RequestMapping("/test")
    public String getPandQ(@RequestParam(name="num")Integer num, Model qaaModel){
        System.out.println(num);
        Testpapertb paper = testPaperService.selectByPrimaryKey(num);
        qaaModel.addAttribute("paper",paper);


        return "quiz/paper";
    }


}
