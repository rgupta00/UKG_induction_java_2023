package com.day10.crud.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {
    public static void main(String[] args) {
       Connection connection=ConnectionFactory.getConnection();
       try{
           PreparedStatement pstmt=connection.prepareStatement
                   ("delete from emp where id=?");
           pstmt.setInt(1,5);
          int noOfRowEffected= pstmt.executeUpdate();
           System.out.println(noOfRowEffected);


       }catch (SQLException e) {
           e.printStackTrace();
       }

    }
}
