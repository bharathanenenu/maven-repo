package com.virphy.practise;

public class LocalGlobalVariables {
	public  static String Name; // Static Global Variable...
	public int EmployeeID=1234; // Non-static global variable.
	
	public LocalGlobalVariables(String Name) {
		this.Name = Name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Employee Name:"+Name);
		//System.out.println(Gender);
		
		//Creating an object of this class
		LocalGlobalVariables obj1 = new LocalGlobalVariables("Dileep");
		obj1.setName();
		empName();
		//setName();
		
		// Object is the superclass of all the classes in JAVA.

	}
	
	public static void sample(String name){  // name is the local variable
		String Gender="Male";  // Local variable
		System.out.println("Name of the employee:"+name);
		System.out.println(Gender);
		
	}
	
	public static void empName(){// static function
		System.out.println(Name);
	}
	
	public void setName(){ // Non static function
		System.out.println("Sandeep");
	}
	

}
