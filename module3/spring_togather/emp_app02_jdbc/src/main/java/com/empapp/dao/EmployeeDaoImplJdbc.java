package com.empapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// employeeDaoImplJdbc
//@Profile(value = "dev")
@Primary
@Repository //Sp type of @Component for dao layer
public class EmployeeDaoImplJdbc implements EmployeeDao{

    private DataSource ds;

    //By type
    @Autowired // for the ctr dep is mandatory if not
    public EmployeeDaoImplJdbc(DataSource ds1) {
        this.ds = ds1;
    }

    @Override
    public List<Employee> getAll() {
      List<Employee> employeeList=new ArrayList<>();
        Connection connection=null;
      try{
           connection = ds.getConnection();
          PreparedStatement stmt=connection.prepareStatement("select * from emp");
          ResultSet rs=stmt.executeQuery();
          while (rs.next()){
              Employee e=new Employee(rs.getInt("id"),
                      rs.getString("name"),
                      rs.getDouble("salary"));
              employeeList.add(e);
         }
      }catch (SQLException e) {
          e.printStackTrace();
      }finally {
          try{
              connection.close();
          }catch (SQLException e){}
      }
      return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        Connection connection=null;

        try{
            connection = ds.getConnection();
            PreparedStatement pstmt=
                    connection
                            .prepareStatement("insert into emp(name, salary) values(?,?)");

            pstmt.setString(1, employee.getName());
            pstmt.setDouble(2, employee.getSalary());
            pstmt.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException e){}
        }
    }
}
