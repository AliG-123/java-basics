package com.qa.java.oop;

public class ProductMainWithConstructors {

	public static void main(String[] args) {
		
		//  No-arg constructor - Default is Apples
		Product product1 = new Product();		
		
		System.out.println();
		
		// arg constructor for Chicken Fillets and Banana
		Product product2 = new Product(2, "Chicken Fillets", 7.25, "Fruits", 5, 8, true);
		
		System.out.println();
		
		Product product3 = new Product(3, "Banana", 1.25, "Fruits", 4, 10, true);

	}

}
