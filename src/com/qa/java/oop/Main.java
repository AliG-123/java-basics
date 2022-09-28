package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
				
				Employee employee; // a reference variable		
				employee = new Employee(); // an employee object is created
//				System.out.println("id: "+ employee.id);
//				System.out.println("name:" +employee.name);
//				System.out.println("department:" +employee.department);
//				System.out.println("gender:" + employee.gender);
//				System.out.println("salary:" + employee.salary);
//				System.out.println("age:" + employee.age);
				
//				employee.id = 111;
//				employee.name = "emp1";
//				employee.department = "development";
//				employee.gender = 'M';
//				employee.salary = 46564.45;
//				employee.age = 25;
				
				System.out.println("id: "+ employee.id);
				System.out.println("name:" +employee.name);
				System.out.println("department:" +employee.department);
				System.out.println("gender:" + employee.gender);
				System.out.println("salary:" + employee.salary);
				System.out.println("age:" + employee.age);
				
				System.out.println();
				
				Employee employee2 = new Employee(222,"emp 2","Development",26564.00, (byte) 26, 'F');
				

				System.out.println("id: "+ employee2.id);
				System.out.println("name:" +employee2.name);
				System.out.println("department:" +employee2.department);
				System.out.println("gender:" + employee2.gender);
				System.out.println("salary:" + employee2.salary);
				System.out.println("age:" + employee2.age);
				
			}

		}
