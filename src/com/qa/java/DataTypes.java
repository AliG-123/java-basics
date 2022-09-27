package com.qa.java;

public class DataTypes {

	public static void main(String[] args) {

		byte age;
		age = 25;
		System.out.println("My age is: " + age + "$");

		short mySalary;
		mySalary = 20000;
		System.out.println("My annual salary is : " + mySalary + "$");

		int totalSalaryOfDepartment;
		totalSalaryOfDepartment = 123456;
		System.out.println("The total salary of the department is : " + totalSalaryOfDepartment + "$");

		long totalSalariesOfAllEmployees;
		totalSalariesOfAllEmployees = 348563821L;
		System.out.println("The total salary of all employees is : " + totalSalariesOfAllEmployees + "$");

		float aDecimalNumber;
		aDecimalNumber = 3.63f;
		System.out.println("Float number: " + aDecimalNumber);

		double anotherDecimalNumber;
		anotherDecimalNumber = 5.64;
		System.out.println("Double number: " + anotherDecimalNumber);

		char character;
		character = 'y';
		System.out.println(character);
		
		boolean trueOrFalse = mySalary < 10000;
		System.out.print(trueOrFalse);
		
	}
}