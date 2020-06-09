package com.heit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")//映射
public class IndexController {

    @RequestMapping(value = "/index.do")
    public ModelAndView showIndex(){
        System.out.println("加载主页");

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","=======hello world");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
