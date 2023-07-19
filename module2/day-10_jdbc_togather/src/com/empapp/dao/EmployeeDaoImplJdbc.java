package com.empapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
//Dao layer need connection object -> connection factory

public class EmployeeDaoImplJdbc implements EmployeeDao{
    private Connection connection;

    public EmployeeDaoImplJdbc(){
        connection=ConnectionFactory.getConnection();
    }
    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList=new LinkedList<>();
        try{
            PreparedStatement stmt=connection.prepareStatement("select * from emp");
            ResultSet rs=stmt.executeQuery();
            while (rs.next()){
                Employee e=new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"));
                employeeList.add(e);

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return employeeList;
    }
}
