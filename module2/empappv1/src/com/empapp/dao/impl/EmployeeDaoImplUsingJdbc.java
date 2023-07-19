package com.empapp.dao.impl;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EmployeeDaoImplUsingJdbc implements EmployeeDao {

    private Connection connection;

    public EmployeeDaoImplUsingJdbc(){
        connection=ConnectionFactory.getConnection();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList=new LinkedList<>();
        try {
            Connection connection=ConnectionFactory.getConnection();
            Statement stmt=connection.createStatement();
            // stmt.setFetchSize(500);
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                Employee e=new Employee(rs.getInt("id"),
                        rs.getString("name"), rs.getDouble("salary"));
                employeeList.add(e);
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee e) {

    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public void updateEmployee(int id, double salary) {

    }

    @Override
    public Optional<Employee> getById(int id) {
        return Optional.empty();
    }
}
