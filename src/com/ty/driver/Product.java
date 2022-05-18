package com.ty.driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
	Myhelper1 m = new Myhelper1();

	public void saveProduct(int id,String name, String brand, String type, double cost) {
		String sql =  "insert into product values(?,?,?,?,?)";
		Connection con = m.getConnection();
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, brand);
			p.setString(4, type);
			p.setDouble(5, cost);
			p.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void productbyBrand(String brand)
	{
		String sql="Select * from product where brand=?";
		Connection con = m.getConnection();
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, brand);
			ResultSet rs=p.executeQuery(sql);
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
			String brand1=rs.getString(3);
				String type= rs.getString(4);
				double cost=rs.getDouble(5);
				System.out.println("Id is: "+id);
				System.out.println("Name is: "+name);
				System.out.println("Brand is: "+brand);
				System.out.println("Type is: "+type);
				System.out.println("cost is: "+cost);
			}
			else System.out.println("sorry no data of "+brand);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void printProductbyType(String type)
	{
		String sql="Select * from product where type=?";
		Connection con = m.getConnection();
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, type);
			ResultSet rs=p.executeQuery(sql);
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
			String brand=rs.getString(3);
				String type1= rs.getString(4);
				double cost=rs.getDouble(5);
				System.out.println("Id is: "+id);
				System.out.println("Name is: "+name);
				System.out.println("Brand is: "+brand);
				System.out.println("Type is: "+type1);
				System.out.println("cost is: "+cost);
			}
			else System.out.println("sorry no data of "+type);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void printTypeAndBrand(String brand,String type)
	{
		String sql="Select * from product where brand=? and type=?";
		Connection con = m.getConnection();
		try {
			PreparedStatement p = con.prepareStatement(sql);
			p.setString(1, brand);
			p.setString(2, type);
			ResultSet rs=p.executeQuery(sql);
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
			    String brand1=rs.getString(3);
				String type1= rs.getString(4);
				double cost=rs.getDouble(5);
				System.out.println("Id is: "+id);
				System.out.println("Name is: "+name);
				System.out.println("Brand is: "+brand1);
				System.out.println("Type is: "+type1);
				System.out.println("cost is: "+cost);
			}
			else System.out.println("sorry no data of "+brand+" "+type);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void printProductById(int id)
	{
		String sql="select * from product where id=?";
		Connection con =m.getConnection();
		try {
			PreparedStatement pr=con.prepareStatement(sql);
			ResultSet rs=pr.executeQuery(sql);
			if(rs.next())
			{
				int id1=rs.getInt(1);
				String name=rs.getString(2);
			String brand=rs.getString(3);
				String type= rs.getString(4);
				double cost=rs.getDouble(5);
				System.out.println("Id is: "+id1);
				System.out.println("Name is: "+name);
				System.out.println("Brand is: "+brand);
				System.out.println("Type is: "+type);
				System.out.println("cost is: "+cost);
			}
			else System.out.println("sorry no data of "+id);
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteById(int id)
	{
		String query="delete product from where id=?";
		Connection con=m.getConnection();
		try {
			PreparedStatement pr=con.prepareStatement(query);
			ResultSet rs=pr.executeQuery();
			pr.setInt(1,id);
			con.close();
			System.out.println("Deleted");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void productUpdate(int id,String name,String brand,String type ,double cost)
	{
		String sql="update product set name=?,brand=?,type=?,cost=? where id=?";
		Connection con=m.getConnection();
		try {
			PreparedStatement pr= con.prepareStatement(sql);
			pr.setString(1, name);
			pr.setString(2, brand);
			pr.setString(3, type);
			pr.setDouble(4, cost);
			pr.setInt(5, id);
			pr.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
