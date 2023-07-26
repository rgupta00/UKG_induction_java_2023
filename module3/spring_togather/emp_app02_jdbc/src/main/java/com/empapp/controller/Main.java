package com.empapp.controller;

import com.empapp.config.AppConfig;
import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //collection, ex handing, jpa, spring
        //-Dspring.profiles.active=dev
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService=applicationContext.getBean("employeeServiceImpl",
                EmployeeService.class);

        Employee emp=new Employee("umesh",55000);
        employeeService.addEmployee(emp);


        List<Employee> employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));

    }
}
