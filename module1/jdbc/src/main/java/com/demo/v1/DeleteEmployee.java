package com.demo.v1;
import java.sql.*;
public class DeleteEmployee {
	
	public static void main(String[] args) {
		try{
			Connection connection=ConnectionFactory.getConnection();
			PreparedStatement pstmt=connection.prepareStatement("delete from emp where id=?");
			pstmt.setInt(1, 4);
			int noOfRowsEffected= pstmt.executeUpdate();
			System.out.println(noOfRowsEffected);
			System.out.println("deleted ...");
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
	}

}
