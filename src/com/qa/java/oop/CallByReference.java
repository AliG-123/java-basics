package com.qa.java.oop;

public class CallByReference {
	
	static String getStudentName(Student student){
		student.name = "Ali Goni";
		System.out.println("Student name inside getStudentName: " + student.name); //Ali Goni
		return student.name;
	}
	public static void main(String[] args) {
		Student student = new Student(111,"Ali");
		System.out.println(student.name); // Ali
		System.out.println(getStudentName(student)); //Ali Goni
		System.out.println("Student name inside main: "+ student.name); // Ali Goni
	}

}
