package com.qa.java;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		num1 = 24;

		// Check if number is odd or even

		if (num1 % 2 == 0) {
			System.out.println("The number " + num1 + " is Even");
		} else {
			System.out.println("The number " + num1 + " is Odd");
		}

		/*
		 * Decide increment percentage based on the experience If experience is greater
		 * than 2 years and department is development then increment 10% If experience
		 * is greater than 5 years and department is sales then increment 8%
		 */
		float salary;
		salary = 28000.50f;
		System.out.println("Current Salary is: £" + salary);
		byte experience;
		experience = 6;

		char department;
		department = 'S';

		byte incrementPercentage;

		if ((experience > 2) && (department == 'D')) {
			incrementPercentage = 10;
		} else if ((experience > 5) && (department == 'S')) {
			incrementPercentage = 8;
		} else {
			incrementPercentage = 5;
		}
		System.out.println("Your salary will increase by " + incrementPercentage + "%");
		salary = salary + (salary * incrementPercentage / 100);
		System.out.println("New salary will be: £" + salary);
	}

}
