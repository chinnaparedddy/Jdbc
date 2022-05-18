package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myhelper1 {
	 String url="jdbc:mysql://localhost:3306/javabatch";
	 String user="root";
	 String password="root";
	 Connection con=null;
	 public Connection getConnection()
	 {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return con;
	 }

}
