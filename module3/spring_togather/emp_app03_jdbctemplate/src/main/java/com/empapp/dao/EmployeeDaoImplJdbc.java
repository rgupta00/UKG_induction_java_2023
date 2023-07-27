package com.empapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

   private JdbcTemplate jdbcTemplate;

   @Autowired
    public EmployeeDaoImplJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
//    @Override
//    public List<Employee> getAll() {
//      return  jdbcTemplate.query("select * from emp", new EmpRowMapper());
//    }

    //using anno inner class
//    @Override
//    public List<Employee> getAll() {
//        return  jdbcTemplate.query("select * from emp", new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet rs, int i) throws SQLException {
//                Employee e=new Employee(rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getDouble("salary"));
//                return e;
//            }
//        });
//
//    }


    @Override
    public List<Employee> getAll() {

        return  jdbcTemplate.query("select * from emp", ( rs,  i) ->
                 new Employee(rs.getInt("id"),
                        rs.getString("name"), rs.getDouble("salary"))
        );

    }

    @Override
    public void addEmployee(Employee employee) {
       jdbcTemplate.update("insert into emp(name, salary) values(?,?)",
               new Object[]{employee.getName(), employee.getSalary()});
    }
}














