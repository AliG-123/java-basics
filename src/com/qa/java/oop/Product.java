package com.qa.java.oop;

public class Product {
	int id;
	String name;
	double price;
	String category;
	double rating;
	int discountPercentage;
	boolean isAvailable;
	
	Product(){
		id = 1;
		name = "Apple";
		price = 3.25;
		category = "Fruits";
		rating = 3;
		discountPercentage = 10;
		isAvailable = true;
		
	}

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
	
}
