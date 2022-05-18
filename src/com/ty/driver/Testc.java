package com.ty.driver;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class Testc {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/javabatch?user=root&password=root";
//		String name="root";
//		String pasword="root";
		String query="insert into student values(11,'malli','malli@gmail')";
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection(url);
			Statement stm=con.createStatement();
			stm.execute(query);
			con.close();
			System.out.println("done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

