package com.ohgiraffers.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
//@RequestMapping("/*")
public class Controller {

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
    @GetMapping("/mission1")
    public ModelAndView mission1(ModelAndView mv, @RequestParam("a") String c) {
        mv.addObject("message", c);
        mv.setViewName("mission1");
        return mv;
    }
}
