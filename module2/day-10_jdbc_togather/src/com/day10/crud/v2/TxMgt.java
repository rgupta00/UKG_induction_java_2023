package com.day10.crud.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TxMgt {
    public static void main(String[] args) {
        //ACID cocepts
        Connection connection=ConnectionFactory.getConnection();
        try{
            connection.setAutoCommit(false);
            PreparedStatement pstmt=connection.prepareStatement
                    ("update account set balance=balance-10 where id=?");
            pstmt.setInt(1,1);

            PreparedStatement pstmt2=connection.prepareStatement
                    ("update account set balance=balance+10 whee id=?");

             pstmt2.setInt(1,2);

            pstmt.executeUpdate();
            pstmt2.executeUpdate();
            connection.commit();

        }catch (SQLException e) {
            try{
                connection.rollback();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
            e.printStackTrace();
        }


    }
}
