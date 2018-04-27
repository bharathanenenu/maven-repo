package com.virphy.practise;

public class FunctionsZ {
	public static String employeeName="Ravi";
	// If two or more functions having the same name with different parameters, then we call it as Method or Function overloading...
	
	public static void main(String[] args) {
		add();
		add(5,25);
		String Name=add(employeeName);
		System.out.println("Name of the Employee:"+Name);
		
	}
	
	public static void add(){ // Dumb functions
		int a=100;
		int b=200;
		
		int sum = a+b;
		System.out.println("Sum of Two Numbers:"+sum);
	}
	
	public static void add(double a, double b){ // Clever function
		double sum = a+b;
		System.out.println("Sum of Two Numbers:"+sum);
	}
	
	public static String add(String name){  //Smart Functions
		String EmployeeName=name;
		return EmployeeName;
	}

}
