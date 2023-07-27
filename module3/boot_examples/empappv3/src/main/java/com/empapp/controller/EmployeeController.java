package com.empapp.controller;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:9090/empapp/v1/api/employees
@RestController
@RequestMapping(path = "v1/api") //?
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //---------------all employees-------------
    @GetMapping(path = "employees")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    //---------------getting a particular employee------------
    @GetMapping(path = "employees/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    //---------adding a new employee -----
    @PostMapping(path = "employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return  employeeService.addEmployee(employee);
    }

    //--------------update a particular employee------------
    @PutMapping(path = "employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    //---------------deleting a particular employee------------
    @DeleteMapping(path = "employees/{id}")
    public Employee deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

}



