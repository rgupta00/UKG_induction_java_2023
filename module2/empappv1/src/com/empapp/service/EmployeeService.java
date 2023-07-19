package com.empapp.service;

import com.empapp.dao.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAll();
    public void addEmployee(Employee e);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public Optional<Employee> getById(int id);
}
