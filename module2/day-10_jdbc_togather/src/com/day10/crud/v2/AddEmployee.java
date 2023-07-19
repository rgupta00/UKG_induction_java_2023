package com.day10.crud.v2;

import java.sql.*;

public class AddEmployee {
    public static void main(String[] args) {
       Connection connection=ConnectionFactory.getConnection();
       try{
           PreparedStatement pstmt=connection.prepareStatement
                   ("insert into emp(name, salary) values(?,?)");
           pstmt.setString(1,"anil");
           pstmt.setDouble(2, 67000);

          int noOfRowEffected= pstmt.executeUpdate();
           System.out.println(noOfRowEffected);


       }catch (SQLException e) {
           e.printStackTrace();
       }

    }
}
