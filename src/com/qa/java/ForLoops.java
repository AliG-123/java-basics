package com.qa.java;

public class ForLoops {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
//			if (i % 2 != 0)
//				System.out.println(i);
			for (int j = 1; j <= 3 ; j++) {
				if(i == 1 || j ==3)break;
				System.out.println(i + "" + j);	
			}
		}
	}
}
