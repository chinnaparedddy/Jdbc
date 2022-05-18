package com.ty.driver;

import java.util.List;

public class StudentCurd1Driver {

	public static void main(String[] args) {
		StudentCudr1 s=new StudentCudr1();
		List list=s.getStudent();
		System.out.println(list);
	}

}
