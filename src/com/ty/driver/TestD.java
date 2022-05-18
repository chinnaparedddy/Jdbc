package com.ty.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestD {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String query="insert into student values(21,'arun','arun@gmail')";

	try {
		
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		Properties p=new Properties();
		InputStream input=new FileInputStream("mydb.properties");
		p.load(input);
		Connection con=DriverManager.getConnection(url, p);
		Statement stm=con.createStatement();
		stm.execute(query);
	} catch (SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
