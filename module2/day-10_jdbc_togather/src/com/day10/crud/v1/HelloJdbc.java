package com.day10.crud.v1;
import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloJdbc {
    public static void main(String[] args) {
        //i should try to load the load the driver
       try {
           Class.forName("org.postgresql.Driver");
           System.out.println("driver is loaded");
       }catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

       //data, table? ukglab    postgres        root
        //Create connection object
        try{
            Connection connection=DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/ukglab",
                            "postgres","root");
            System.out.println("connection is done");

            //i want to print all the emp details
            //Statement vs PreparedStatement vs CallableStatement
            //PreparedStatement: is better in perforamance
            //not having problem of SQL injection

//            Statement stmt=connection.createStatement();
//            //executeQuery vs executeUpdate
//            //fetch        +     update/add/delete
//            ResultSet rs=stmt.executeQuery("select * from emp");
//            while (rs.next()){
//                System.out.println(rs.getInt(1)+" : "+
//                        rs.getString(2)+": "+ rs.getDouble(3));
//            }

            PreparedStatement stmt=connection.prepareStatement("select * from emp");
            //executeQuery vs executeUpdate
            //fetch        +     update/add/delete
            ResultSet rs=stmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id")+" : "+
                        rs.getString("name")+": "+ rs.getDouble("salary"));
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}





