package com.empapp.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        System.out.println("emp row mapper is called "+i);
        Employee e=new Employee(rs.getInt("id"),
                rs.getString("name"),
                rs.getDouble("salary"));
        return e;
    }
}
