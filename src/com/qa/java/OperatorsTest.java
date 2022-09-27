package com.qa.java;

public class OperatorsTest {

	public static void main(String[] args) {

		// Assignment Operator
		// = is used to assign values

		int salary;
		salary = 20000;

		float productPrice;
		productPrice = 102.50f;
		System.out.println("Product price: £" + productPrice);

		salary = salary + (salary * 10 / 100);
		System.out.println(salary);

		float discount;
		discount = (productPrice * 5 / 100);
		System.out.println("discount is £" + discount);

		float finalPrice;
		finalPrice = productPrice - discount;
		System.out.println("The final price is: £" + finalPrice);
		
		byte num1;
		num1 = 10;
		System.out.println(num1++);
		System.out.println(++num1);
		
		byte num2;
		num2 = 20;
		System.out.println(num2--);
		System.out.println(--num2);
		
		/*Relational Operators
		 *> 
		 *>=
		 *<
		 *<=
		 *==
		 *!=
		 */
		
		System.out.println("Is salary greater than 50000: " + (salary > 50000));
		System.out.println("Is salary greater than or equal to 50000: " + (salary >= 50000));
		System.out.println("Is salary less than 50000: " + (salary < 50000));
		System.out.println("Is salary less than or equal to 50000: " + (salary <= 50000));
		System.out.println("Is salary equal 50000: " + (salary == 50000));
		System.out.println("Is salary not equal to 50000: " + (salary != 50000));

		/*Logical Operators
		 * && Logical And 
		 * || Logical Or
		 * ^  Logical XOR (strictly or)
		 */
		
		byte age;
		age = 25;
		
		System.out.println((salary>50000) && (age<30));
		System.out.println((salary>50000) || (age<30));
		System.out.println((salary>10000) ^  (age<30));
		
//	int productPrice = 20;
//	byte discountPercentage = 3;
//	
//	float discountPrice = ( (float)productPrice * discountPercentage) / 100;
//	System.out.println(discountPrice);
//	System.out.println(discountPrice);

	}
}
