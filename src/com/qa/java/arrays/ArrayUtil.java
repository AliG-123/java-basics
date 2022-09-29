package com.qa.java.arrays;

public class ArrayUtil {
	
	int getMaleGenders(char[] genders) {
		int count = 0;
		for (char gender: genders) {
			if (gender == 'M')
				count++;
		}
		return count;
	}
	int getFemaleGenders(char[] genders) {
		int count = 0;
		for (char gender: genders) {
			if (gender == 'F')
				count++;
		}
		return count;
	}
}
