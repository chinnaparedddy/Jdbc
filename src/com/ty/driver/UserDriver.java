package com.ty.driver;

public class UserDriver {
	public static void main(String[] args) {
		InsertUser u=new InsertUser();
		//u.saveUser(2, "naresh", "nari@gmail", "nari", 99894521);
		//u.printuserByemail("nari@gmail");
		//u.printUserByMobile(99894521);
		//u.deleteUserById(1);
		u.updateUser(1, "naresh", "nari@gmail", "nari", 99894521);
	}
}
