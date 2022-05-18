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

public class TestE {

	public static void main(String[] args) {
		//creaate object for propertiy class
		Properties properties=new Properties();
		
		try {
			InputStream inputStream = new FileInputStream("mydb1.properties");
			properties.load(inputStream);
			String driver1= properties.getProperty("driver");
			String url=properties.getProperty("url");
			Class.forName(driver1);
			Connection con=DriverManager.getConnection(url,properties);
			Statement stm=con.createStatement();
			stm.execute("insert into student values(12,'sridhar','sri@gmail')");
			con.close();
			System.out.println("Added");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
