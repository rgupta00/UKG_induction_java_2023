package com.empapp.service;

import com.empapp.dao.Employee;

import java.util.List;
//Service layer invoke dao layer and have extra logic *
public interface EmployeeService {
    public List<Employee> getAll();
    public void addEmployee(Employee employee);
    public Employee getById(int id);
    public void updateEmployee(int id, Employee employee);
    public void deleteEmployee(int id);
}
