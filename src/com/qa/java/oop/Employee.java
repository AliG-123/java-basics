package com.qa.java.oop;

public class Employee {

		//Static Data
	
	int id;
	String name;
	String department;
	double salary;
	byte age;
	char gender;
	//Each employee object will have its own state

	//No-arg constructor
	Employee(){
		System.out.println("Employee() constructor is called ..");
		id = 111;
		name = "emp1";
		department = "Develeopment";
		salary = 12400;
		age = 25;
		gender = 'M';
				
	//Arg Constructor
				
	}

	public Employee(int id, String name, String department, double salary, byte age, char gender) {
		System.out.println("Employee(arg) comstructor is called");;
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}
}
