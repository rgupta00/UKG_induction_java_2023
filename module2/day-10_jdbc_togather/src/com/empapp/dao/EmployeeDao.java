package com.empapp.dao;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    public List<Employee> getAll();
    public void addEmployee(Employee employee);
    public Optional<Employee> getById(int id);
    public void updateEmployee(int id, Employee employee);
    public void deleteEmployee(int id);

}
