package com.ty.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MyHelper {
	
	
	private String url="jdbc:mysql://localhost:3306/javabatch";
	private String user="root";
	private String password="root";
	private Connection con=null;
	//Properties properties=new Properties();
	public Connection getConnectionobj()
	{
		try {
//			InputStream inputStream=new FileInputStream("mydb1.properties");
//			properties.load(inputStream);
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
}
