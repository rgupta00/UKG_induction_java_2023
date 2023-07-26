package com.empapp.controller;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
//@Controller + @ResponseBody
@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "employees")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping(path = "employees")
    public String addEmployee( @RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "employee added successfully";
    }
}
