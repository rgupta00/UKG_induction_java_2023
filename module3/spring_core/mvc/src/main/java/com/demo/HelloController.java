package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Contended;

import javax.servlet.http.HttpServlet;

//POJO: plane old java object=> test, DI
@Controller
public class HelloController {

    @GetMapping(path = "hello")
    public ModelAndView hello(ModelAndView mv){
        mv.setViewName("show");
        mv.addObject("info","spring mvc hello");
        return mv;
    }
    @GetMapping(path = "bye")
    public ModelAndView bye(ModelAndView mv){
        mv.setViewName("foo");
        //it add the data to the req scope
        mv.addObject("info","spring mvc hello bye");
        return mv;
    }
}
