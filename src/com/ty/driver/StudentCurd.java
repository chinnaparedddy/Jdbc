package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCurd {
	// We create the healper method then we can use the method n number of times
	static MyHelper m = new MyHelper();

	public void saveStudent(int id, String name, String email) {

		try {

			Connection con = m.getConnectionobj();
			Statement stm = con.createStatement();
			String query = "insert into student values(" + id + ",'" + name + "','" + email + "')";
			stm.execute(query);
			con.close();
			System.out.println("added");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void deleteStudent(int id) {

		try {

			Connection con = m.getConnectionobj();
			Statement stm = con.createStatement();
			String query = "delete from student where id=" + id + "";
			stm.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getStudents() {
		Connection con = m.getConnectionobj();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from student");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				System.out.println("Id is :" + id);
				System.out.println("Name is :" + name);
				System.out.println("Gmail is :" + email);
				System.out.println("=================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void studentId(int id) {

		try {
			Connection con = m.getConnectionobj();
			Statement stm = con.createStatement();
			ResultSet r = stm.executeQuery("select * from student");
			if (r.next()) {
				int id1 = r.getInt(1);
				String name = r.getString(2);
				String email = r.getString(3);
				System.out.println("Id is :" + id1);
				System.out.println("Name is :" + name);
				System.out.println("Gmail is :" + email);
			} else
				System.out.println("Id Data is not found" + id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStudent(String name, int id) {

		try {
			Connection con = m.getConnectionobj();
			Statement stm;
			stm = con.createStatement();
			String update = "update student set name='" + name + "' where id =" + id + "";

			stm.execute(update);

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateStudent(int id, String name, String email) {

		try {
			Connection con = m.getConnectionobj();
			Statement stm;
			stm = con.createStatement();
			String update = "update student set name='" + name + "',email='" + email + "' where id =" + id;

			stm.execute(update);
			con.close();
			System.out.println("added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
