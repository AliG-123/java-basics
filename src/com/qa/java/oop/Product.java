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
		System.out.println("Product id: "+ id);
		System.out.println("Product name: " + name);
		System.out.println("Product Catergory: " + category);
		System.out.println("Product rating: " + rating + "/5.0");
		System.out.println("Product in stock: " + isAvailable);
		System.out.println(discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" + price);
		System.out.println("Discounted Product Price: £" + (price - (price * discountPercentage/100)));
		System.out.println();
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
		System.out.println("Product id: "+ this.id);
		System.out.println("Product name: " +this.name);
		System.out.println("Product Catergory: " + this.category);
		System.out.println("Product rating: " + this.rating + "/5.0");
		System.out.println("Product in stock: " + this.isAvailable);
		System.out.println(this.discountPercentage + "% discount available");
		System.out.println("Originial Product Price: £" +this.price);
		System.out.println("Discounted Product Price: £" + (this.price - (this.price * this.discountPercentage/100)));
		System.out.println();
	}
	
}
