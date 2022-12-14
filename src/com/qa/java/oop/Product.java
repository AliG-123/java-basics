package com.qa.java.oop;

public class Product {
	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;
	
	
	final static String SHOP_NAME = "Asda";
	final static double SHOP_REVENUE = 1029300.91;
	
	//No arg constructer
	
	Product(){
		System.out.println("No details given. Default Apple product info displayed.");
		id = 1;
		name = "Apple";
		price = 3.25;
		category = "Fruits";
		rating = 3;
		discountPercentage = 10;
		isAvailable = true;
		
	}
	
	
	//arg constructer

	public Product(int id, String name, double price, String category, double rating, int discountPercentage,
			boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
		
	}
	
	//method display product info
	
	void productInfo(){
			System.out.println("Product id: " + id);
			System.out.println("Product name: " + name);
			System.out.println("Product Catergory: " + category);
			System.out.println("Product rating: " + rating + "/5.0");
			System.out.println("Product in stock: " + isAvailable);
			System.out.println(discountPercentage + "% discount available");
			System.out.println("Originial Product Price: £" + price);
			System.out.println("Discounted Product Price: £" + Math.round((price - (price * discountPercentage / 100))*100.00)/100.00);
			System.out.println();
	}

	static void shopInfo() {
		System.out.println("Shop name is: " + SHOP_NAME);
		System.out.println("Shop revenue is: " + SHOP_REVENUE);
	}

}
