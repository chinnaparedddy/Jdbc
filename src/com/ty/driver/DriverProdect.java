package com.ty.driver;

public class DriverProdect {

	public static void main(String[] args) {
		Products p=new Products();
		p.setId(1);
		p.setName("Sony");
		p.setBrand("Sonynew");
		p.setType("Led");
		p.setCost(25000);
		ProductMethods pm=new ProductMethods();
		pm.saveProduct(p);

	}

}
