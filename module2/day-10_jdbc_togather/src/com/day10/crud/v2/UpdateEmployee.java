package com.day10.crud.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
    public static void main(String[] args) {
       Connection connection=ConnectionFactory.getConnection();
       try{
           PreparedStatement pstmt=connection.prepareStatement
                   ("update emp set salary =? where id=?");
           pstmt.setDouble(1,100_000.50);
           pstmt.setInt(2,5);
          int noOfRowEffected= pstmt.executeUpdate();
           System.out.println(noOfRowEffected);


       }catch (SQLException e) {
           e.printStackTrace();
       }

    }
}
