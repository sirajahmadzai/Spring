package com.firstspring.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController{

    @RequestMapping(value = "/welcome")
   public ModelAndView helloWorld(){
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("msg", "hello world");

        return modelAndView;
    }

    @RequestMapping(value = "/hi")
    public ModelAndView hiWorld(){
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("msg", "hi world");

        return modelAndView;
    }
}
