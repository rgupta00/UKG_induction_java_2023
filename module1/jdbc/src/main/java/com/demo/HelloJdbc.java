package com.demo;

import java.sql.*;

public class HelloJdbc {

	public static void main(String[] args) {
		// getting all records from the database

		// 1. you have to load the driver: dynamically ?
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. you need to get a jdbc connection

		try (Connection connection = DriverManager
				.getConnection
				("jdbc:postgresql://localhost:5432/ukgdemo",
				"postgres", 
				"root")) {

			// get the data vs change the database state
			Statement stmt = connection.createStatement();
			//C: create 	R: read     U:update 			D:delete
			
			// executeQuery: R: read     fetch the data 
			//executeUpdate: C: create 	U:update D:delete
			
			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) +
						": " + rs.getString(2) +
						": " + rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3. we need to get something that is Statement --> resultset --> we fetch the
		// rec --> till not finished

		// 4. we close the conn

	}

}
