package com.empapp.dao;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    public List<Employee> getAll();
    public void addEmployee(Employee e);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public Optional<Employee> getById(int id);

}
