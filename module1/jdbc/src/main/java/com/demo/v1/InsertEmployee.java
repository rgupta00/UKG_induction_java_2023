package com.demo.v1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//used to insert an emplyees inforamtion
public class InsertEmployee {
	
	public static void main(String[] args) {
		
		//SQL injection ?
		
		// Statement	vs PreparedStatement  vs		CallableStatement
		try {
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection
					.prepareStatement("insert into emp(name, salary) values(?,?)");
			pstmt.setString(1, "hari");
			pstmt.setDouble(2, 44000);
			
			int noOfRows= pstmt.executeUpdate();// executeUpdate vs executeQuery
			
			System.out.println(noOfRows);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
