package com.empapp.service;

import com.empapp.entities.Employee;

import java.util.*;

public interface EmployeeService {

    public List<Employee> getAll();
    public Employee getById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int id, Employee employee);
    public Employee deleteEmployee(int id);

}
