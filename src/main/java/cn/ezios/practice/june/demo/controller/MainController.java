package cn.ezios.practice.june.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        mv.addObject("msg","nihao?");
        return mv;
    }

    @RequestMapping("/t")
    public ModelAndView tindex(ModelAndView mv){
        mv.setViewName("tindex");
        mv.addObject("msg","nihao?");
        return mv;
    }
}
