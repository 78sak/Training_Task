package com.javatraining;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		teacher t1 = new teacher();
		t1.setName("sak");
		t1.setDepartment("IT");
		String mydept = t1.getdepartment();
		System.out.println(mydept);
		System.out.println(t1.getName());
		
		teacher t2 = new teacher();
		t2.setName("sarthak");
		System.out.println(t2.getName());
		
	}

}
