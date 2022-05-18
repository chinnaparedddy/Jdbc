package com.ty.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentCudr1 {

	public List<Student> getStudent()
	{
		String query="select * from student";
		Myhelper1 m=new Myhelper1();
		Connection connnection=m.getConnection();
		List<Student> list=new ArrayList();
		 PreparedStatement preparedStatement;
		try {
			preparedStatement = connnection.prepareStatement(query);
			 ResultSet resultset=preparedStatement.executeQuery();
			 while (resultset.next())
			 {
				 int id=resultset.getInt(1);
				 String name=resultset.getString(2);
				 String email=resultset.getString(3);
				 Student student =new Student();
				 student.setId(id);
				 student.setName(name);
				 student.setEmail(email);
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
}
