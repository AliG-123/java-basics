package com.qa.java.arrays;

public class ArraysTest {

	public static void main(String[] args) {

		int id1, id2, id3;
		id1 = 111;
		id2 = 222;
		id3 = 333;

		// Array Syntax
		// datatype[] reference
		int[] ids;
		ids = new int[3];
		ids[0] = id1;
		ids[1] = id2;
		ids[2] = id3;

		for (int index = 0; index < ids.length; index++) {
			System.out.println(ids[index]);
		}
		// enhanced for loop
		// for each element in array
		for (int id : ids) {
			System.out.println(id + 10);
		}
		int[] nos = { 10, 20, 30, 40 };
		for(int i = 0 ; i < nos.length ; i++) {
			nos[i] += 10;
		}
		for(int number : nos) {
			System.out.println(number);
		}
		char[] genders = {'M','F', 'M','F','F','M'};
		
		for (char gender : genders) {
			System.out.println(gender);
		}
		
		ArrayUtil arrayUtil = new ArrayUtil();
		int maleCount = arrayUtil.getMaleGenders(genders);
		System.out.println(maleCount);
		int femaleCount = arrayUtil.getFemaleGenders(genders);
		System.out.println(femaleCount);
	}
}
