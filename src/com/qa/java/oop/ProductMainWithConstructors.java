package com.qa.java.oop;

public class ProductMainWithConstructors {
	
	static void productInfo(Product Item){
		System.out.println("Product id: "+ Item.id);
		System.out.println("Product name: " + Item.name);
		System.out.println("Product Catergory: " + Item.category);
		System.out.println("Product rating: " + Item.rating + "/5.0");
		System.out.println("Product in stock: " + Item.isAvailable);
		System.out.println(Item.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + Item.price);
		System.out.println("Discounted Product Price: £" + (Item.price - (Item.price * Item.discountPercentage/100)));
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		//  No-arg constructor - Default is Apples
		Product product1 = new Product();		
		productInfo(product1);
		
		// arg constructor for Chicken Fillets and Banana
		Product product2 = new Product(2, "Chicken Fillets", 7.25, "Fruits", 5, 8, true);
		productInfo(product2);
		
		System.out.println();
		
		Product product3 = new Product(3, "Banana", 1.25, "Fruits", 4, 10, true);
		productInfo(product3);

	}
}
