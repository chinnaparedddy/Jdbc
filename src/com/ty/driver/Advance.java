package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Advance {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String name="root";
		String pasword="root";
		String query="insert into prodect values(3,'micromax','mac','lcd',50000)";
		String del="delete from prodect where id=1";
		String update="update prodect set brand='redmi' where id=3";
		String fetch="Select * from prodect";
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(url, name, pasword);
			Statement stm=con.createStatement();
			stm.execute(update);
			con.close();
			System.out.println("done");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException a)
		{
			a.printStackTrace();
		}
	}

}
