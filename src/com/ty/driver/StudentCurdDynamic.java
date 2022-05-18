package com.ty.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentCurdDynamic {
	MyHelper m = new MyHelper();

	public void saveStudent(int id, String name, String email) {
		Connection con = m.getConnectionobj();
		String sql = "insert into student values(?,?,?)";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setInt(1, id);
			pre.setString(2, name);
			pre.setString(3, email);

			pre.execute();
			con.close();
			System.out.println("added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteStudent(int id) {
		Connection con = m.getConnectionobj();
		String sql = "delete from student where id=?";
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.execute();
			con.close();
			System.out.println("deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStudent(String name, String email, int id) {
		Connection con = m.getConnectionobj();
		String sql = "update student set name=?,email=? where id=?";
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, name);
			p.setString(2, email);
			p.setInt(3, id);
			p.execute();
			con.close();
			System.out.println("updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void printById(int id)
	{
		String sql="select * from student where id=?";
		Connection con=m.getConnectionobj();
		try {
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				int rid=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				System.out.println("Id is :"+rid);
				System.out.println("Name  is :"+name);
				System.out.println("Gmail is :"+email);
				System.out.println("=======================");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
