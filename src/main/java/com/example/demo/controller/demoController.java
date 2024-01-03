package com.example.demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(required = false) String name){
        if(StringUtils.hasText(name)) return "Hello "+name;
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name){
        if(StringUtils.hasText(name)) return "Hello "+name;
        return "Hello World";
    }



}
