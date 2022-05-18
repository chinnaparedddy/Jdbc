package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestA {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String userName = "root";
		String password = "root";
		String sql = "INSERT INTO javabatch.student values(4,'naresh','naresh@gmail');";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			con.close();
			System.out.println("Data inserted");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
