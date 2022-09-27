package com.qa.java;

public class OddNumbers {

	public static void main(String[] args) {
		/*
		 * Print all odd numbers between 0-1000
		 */
		int number = 0;
		while (number <= 1000) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		number++;
		}
	}
}
