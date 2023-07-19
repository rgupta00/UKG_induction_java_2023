package com.day10.crud.v2;
import java.sql.*;

public class HelloJdbcV2 {
    public static void main(String[] args) {

        try{
            Connection connection=ConnectionFactory.getConnection();

            PreparedStatement stmt=connection.prepareStatement("select * from emp");

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





