package com.qa.java;

public class WhileLoop {

	public static void main(String[] args) {
		int number = 1;
		while (number <= 10) {
			System.out.println(number);
			if (number==5) {
				break;
			}
		number++;
		}

	}

}
