package com.dp.creational.d.simple_factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static Connection connection = null;

	public static Connection getConnection() {
		//u need to load the driver
		Properties properties=new Properties();
		//u want to read the data base details from property file
		InputStream is=null;
		try{
			is=new FileInputStream("db.properties");
			properties.load(is);
		}catch (IOException ex){
			ex.printStackTrace();
		}

		String url=properties.getProperty("jdbc.url");
		String driver=properties.getProperty("jdbc.driver");
		String username=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");


		try{
			Class.forName(driver);
			System.out.println("---driver is loaded..");
		}catch (ClassNotFoundException e){
			System.out.println(e);
		}
		//create the connection and return it
		try {
			connection = DriverManager.getConnection(url, username, password);
		}catch (SQLException e) {
		    e.printStackTrace();
		}
		return connection;
	}

}