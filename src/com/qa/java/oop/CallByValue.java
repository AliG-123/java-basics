package com.qa.java.oop;

public class CallByValue {
	
	static int sum(int no1, int no2) {
		no1 = 1000;
		no2 = 2000;
		System.out.println("No1 in sum:" + no1);
		System.out.println("No2 in sum:" + no2);
		return no1 + no2;
	}

	public static void main(String[] args) {
		// call sum method
		int no1 = 100;
		int no2 = 200;
		int sum = sum(no1,no2);
		System.out.println(sum);
		
		System.out.println("No1 in main:" + no1);
		System.out.println("No2 in main:" + no2);
	}

}
