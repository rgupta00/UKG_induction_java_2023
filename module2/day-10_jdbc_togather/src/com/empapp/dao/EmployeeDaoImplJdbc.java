package com.empapp.dao;

import com.empapp.exceptions.EmployeeNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

//Dao layer need connection object -> connection factory
//u have done
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

    @Override
    public void addEmployee(Employee employee) {
        try{
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("insert into emp(name, salary) values(?,?)");

            pstmt.setString(1, employee.getName());
            pstmt.setDouble(2, employee.getSalary());

            pstmt.executeUpdate();

        }catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    @Override
    public Optional<Employee> getById(int id) {
        Employee e=null;
        try{
            PreparedStatement pstmt=
                    connection.prepareStatement("select * from emp where id=?");
            pstmt.setInt(1, id);

            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                 e=new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.ofNullable(e);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        try{
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("update emp set salary=? where id=?");
            pstmt.setDouble(1, employee.getSalary());
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        int noOfRowsEffected=0;
        try{
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("delete from emp where id=?");
            pstmt.setInt(1, id);
            noOfRowsEffected= pstmt.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        if(noOfRowsEffected==0)
            throw new EmployeeNotFoundException("emp with id is not found "+id);
    }
}
