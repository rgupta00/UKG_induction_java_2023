package com.demo.v1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection = null;

	public static Connection getConnection() {

		// read the prop file and make token of key and value
		// and then use the key to get the value
		InputStream inputStream = null;
		Properties properties = null;
		try {
			inputStream = new FileInputStream("db.properties");
			properties = new Properties();
			properties.load(inputStream);// if we use string token... we have to write code ourself :)
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driver= properties.getProperty("jdbc.driver");
		String url= properties.getProperty("jdbc.url");
		String username= properties.getProperty("jdbc.username");
		String password= properties.getProperty("jdbc.password");
//		System.out.println(driver);
//		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager
					.getConnection(url,username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}
