package com.ty.driver;

public class ProductMethods {
	
	public void saveProduct(Products p)
	{
		System.out.println("Id "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Brand :"+p.getBrand());
		System.out.println("Type :"+p.getType());
		System.out.println("Cost :"+p.getCost());
	}

}
