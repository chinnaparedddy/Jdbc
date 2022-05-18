package com.ty.driver;

import java.util.Scanner;

public class ProdectDriver {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Product p=new Product();
		boolean flag=true;
		do {
			System.out.println("****Home page****");
			System.out.println("1.save product");
			System.out.println("2.print product by brand");
			System.out.println("3.print product by type");
			System.out.println("4.print product by type and brand");
			System.out.println("5.print by id");
			System.out.println("6.del by id");
			System.out.println("7.update prodect");
			System.out.println("8.Exit");
			System.out.println("Chose ur option");
			int choise =s.nextInt();
			switch(choise)
			{
			case 1:
			{
				System.out.println("enter the id,name,brand type,cost");
				int id=s.nextInt();
				String name=s.next();
				String brand=s.next();
				String type=s.next();
				double cost=s.nextDouble();
				p.saveProduct(id, name, brand, type, cost);
				System.out.println("add product sucessfully");
			}break ;
			case 2:
			{
				System.out.println("enter the brand ");
				String brand=s.next();
				p.productbyBrand(brand);
			}break;
			case 3:
			{
				System.out.println("enter the type");
				String type=s.next();
				p.printProductbyType(type);
			}break;
			case 4:
			{
				System.out.println("enter the type brand");
				String name=s.next();
				String type=s.next();
				p.printTypeAndBrand(name, type);
			}break;
			
			case 5:
			{
				System.out.println("Enter the id");
				int id=s.nextInt();
				p.printProductById(id);
			}break;
			case 6:
			{
				System.out.println("enter the id by del");
				int id=s.nextInt();
			}break;
			case 7:
			{
				System.out.println("Enter the update id, name brand type cost");
				int id=s.nextInt();
				String name=s.next();
				String brand=s.next();
				String type=s.next();
				double cost=s.nextDouble();
				p.productUpdate(id, name, brand, type, cost);
			}break;
			case 8:
			{
				flag=false;
				System.out.println("Thank You..............!");
			}break;
			default: System.out.println("Sorry............!");
			}
			
		}while(flag);
		

	}

}
