package com.empapp.service;

import com.empapp.entities.Employee;

import java.util.*;

public interface EmployeeService {

    public List<Employee> getAll();
    public Employee getById(String id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(String id, Employee employee);
    public void deleteEmployee(String id);

}
