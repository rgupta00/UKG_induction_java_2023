package com.dp.creational.d.simple_factory;

import java.sql.*;

//jdbc
public class HelloJdbc {
    public static void main(String[] args) {
        //1. load the driver

        //U need to get a connection object to talk to db (under the hood it use tcp/ip)
        try {

            Connection connection=ConnectionFactory.getConnection();

            Statement stmt=connection.createStatement();
           // stmt.setFetchSize(500);
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                System.out.println(rs.getInt("id")+": "+
                        rs.getString("name")+": "+ rs.getDouble("salary"));
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
