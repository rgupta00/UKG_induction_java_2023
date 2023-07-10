package com.demo.v1;

import java.sql.*;
//used to print all emplyees inforamtion
public class GetAllEmployees {

	public static void main(String[] args) {
	
		try {
			Connection connection = ConnectionFactory.getConnection();

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) +
						": " + rs.getString(2) +
						": " + rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
