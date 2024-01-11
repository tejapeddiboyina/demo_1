package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class demoController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String helloWorld(@RequestParam(required = false) String name){
        if(StringUtils.hasText(name)) return "Hello "+name;
        return "Hello World";
    }

    @GetMapping("/getName")
    public String getName(@RequestParam String name){
        return name;
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name){
        if(StringUtils.hasText(name)) return "Hello "+name;
        return "Hello World";
    }

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam String id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.getEmployeeWithFullName(employee);
    }



}
