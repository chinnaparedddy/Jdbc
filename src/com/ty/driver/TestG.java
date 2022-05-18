package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestG {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		 String user="root";
	 String password="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=	DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		//resultset is Store the data in a row format
		//when eve u read the data from the dable u can use executeQuery()
	ResultSet s=	st.executeQuery("Select * from student");
	//next();return type is boolean and it can forword the present line
	//to the next line
	while(s.next())
	{
		int id=s.getInt(1);
		//getInt(row value)it can take the row value 
		String name=s.getString(2);
		String email=s.getString(3);
		System.out.println("Id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Gmail is :"+email);
		System.out.println("=================");
	}
	con.close();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
