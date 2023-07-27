package com.empapp.controller;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*
@Controller+ @ResponseBody

@ResponseBody: covert java object to json
 */
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
    public String addEmployee(@RequestBody Employee employee){
         employeeService.addEmployee(employee);
         return "employee is added successfully";
    }

}
