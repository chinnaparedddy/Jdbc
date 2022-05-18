package com.ty.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertUser 
{
	static String url="jdbc:mysql://localhost:3306/javabatch";
	static String users="root";
	static String password="root";
	static Connection con=null;
    public static Connection  helper()
    {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, users, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
    	
    }
    public void saveUser(int id,String name,String email,String pasword,long mobile)
    {
    	String sql="insert into user values(?,?,?,?,?)";
    	Connection con=helper();
    	try {
			PreparedStatement pr= con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.setString(2,name);
			pr.setString(3,email);
			pr.setString(4,pasword);
			pr.setLong(5, mobile);
			pr.execute();
			con.close();
			System.out.println("data add");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void printuserByemail(String email)
    {
    	String sql="select * from user where email=?";
    	Connection con =helper();
    	try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, email);
			ResultSet rs=pre.executeQuery();
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name =rs.getString(2);
				String email1 =rs.getString(3);
				String pass =rs.getString(4);
				long mobile =rs.getLong(5);
				System.out.println("Id is: "+id);
				System.out.println("Name is: "+name);
				System.out.println("email is: "+email1);
				System.out.println("Password is: "+pass);
				System.out.println("Mobile no :"+mobile);
			}
			else System.out.println("sorry no data of: "+email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public void printUserByMobile(long mobile)
    {
    	String sql="select * from user where mobile=?";
    	Connection con=helper();
        try {
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setLong(1, mobile);
			ResultSet rs=stm.executeQuery();
			
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name =rs.getString(2);
				String email =rs.getString(3);
				String pass =rs.getString(4);
				long mobile1 =rs.getLong(5);
				System.out.println("Id is: "+id);
				System.out.println("Name is: "+name);
				System.out.println("email is: "+email);
				System.out.println("Password is: "+pass);
				System.out.println("Mobile no :"+mobile1);
			}
			else System.out.println("no data in :"+mobile);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void  deleteUserById(int id)
    {
    	Connection con=helper();
    	String query="delete from user where id=?";
    	try {
		PreparedStatement prepare=con.prepareStatement(query);
		prepare.setInt(1, id);
		con.close();
		System.out.println("deleted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public void updateUser(int id,String name,String email,String pasword,long mobile)
    {
    	String query="update user set name=?,email=?,pasword=?,mobile=? where id=?" ;
    	Connection con=helper();
    	try {
		PreparedStatement pre=con.prepareStatement(query);
		pre.setString(1, name);
		pre.setString(2, email);
		pre.setString(3, pasword);
		pre.setLong(4, mobile);
		pre.setInt(5, id);
		con.close();
		System.out.println("updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
