package com.empapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping(path = "myapp")
    public String hello(){
        return "hello to my app : "+ port;
    }

    //pathvariable vs request param
                        //hello/rajat
    @GetMapping(path = "hello/{fname}/{lname}")
    public String hello( @PathVariable(name = "fname") String n1,
                         @PathVariable(name = "lname") String n2){
        return "hello champs "+ n1+" "+ n2;
    }

    @GetMapping(path = "bye")
    public String helloBye(){
        return "bye to spring boot";
    }

}
