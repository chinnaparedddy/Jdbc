package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Naresh {
	public static void main(String[] args) {
		String user="root";
		String pasword="root";
		String url="jdbc:mysql://localhost:3303/javabatch";
		String query="insert into prodect values(1,'sony','cheana','led',25000)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pasword);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
