package com.demo.v1;
import java.sql.*;
public class UpdateEmployee {
	
	public static void main(String[] args) {
		try{
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection.prepareStatement("update emp set salary=? where id=?");
			pstmt.setDouble(1, 70000);
			pstmt.setInt(2, 4);
			pstmt.executeUpdate();
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
	}

}
