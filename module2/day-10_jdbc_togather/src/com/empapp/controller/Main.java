package com.empapp.controller;

import com.empapp.dao.Employee;
import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=
                new EmployeeServiceImpl();


//        Employee employee=new Employee("Pooja",9800);
//        employeeService.addEmployee(employee);
//
//
//        List<Employee>employeeList=employeeService.getAll();
//        employeeList.forEach(e-> System.out.println(e));

//       try{
//           Employee e=employeeService.getById(1);
//           //it can be taken from the
//           e.setSalary(9000);
//           employeeService.updateEmployee(1, e);
//
//           System.out.println(e);
//
//       }catch (EmployeeNotFoundException ex) {
//           System.out.println(ex.getMessage());
//       }

      //  employeeService.deleteEmployee(80);

        try{
            Employee e=employeeService.getById(1000);
            System.out.println(e);

        }catch (EmployeeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
