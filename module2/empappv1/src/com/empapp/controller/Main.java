package com.empapp.controller;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        List<Employee> employeeList=employeeService.getAll();
        employeeList.forEach(e-> System.out.println(e));
    }
}
