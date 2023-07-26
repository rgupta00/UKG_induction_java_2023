package com.empapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //pathvariable vs request param
                        //hello/rajat
    @GetMapping(path = "hello/{uname}/{lname}")
    public String hello( @PathVariable(name = "uname") String n1,
                         @PathVariable(name = "lname") String n2){
        return "hello champs "+ n1+" "+ n2;
    }

    @GetMapping(path = "bye")
    public String helloBye(){
        return "bye to spring boot";
    }

}
