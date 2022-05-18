package com.ty.driver;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Testb {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String name="root";
		String pass="root";
		String res="delete from student where id=1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, name, pass);
		
			Statement stmt = con.createStatement();
			stmt.execute(res);
			con.close();
			System.out.println("Delete");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
