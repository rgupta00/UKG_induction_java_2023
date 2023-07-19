package com.empapp.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Connection connection;
    private ConnectionFactory(){}
    public static Connection getConnection(){
        //i need to read the prop file and put the values to the drivername, url , username password
        String driver=null;
        String username=null;
        String url=null;
        String password= null;
       try {
           InputStream is = new FileInputStream("db.properties");
           Properties props = new Properties();
           props.load(is);
           driver=props.getProperty("jdbc.driver");
           username=props.getProperty("jdbc.username");
           password=props.getProperty("jdbc.password");
           url=props.getProperty("jdbc.url");

       }catch (IOException ex){
           ex.printStackTrace();
       }
        try {
            Class.forName(driver);
            System.out.println("driver is loaded");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       try{
           connection=DriverManager.getConnection
                   (url, username,password);
       }catch (SQLException ex){
           ex.printStackTrace();
       }
        return  connection;
    }

}
