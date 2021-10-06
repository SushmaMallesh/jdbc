package com.chocolate;

public class Chocolate {

	String brand;
	int price;
	
	Chocolate(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
		
	}
	void display()
	{
		System.out.println(brand+ " "+price);
	}
}
  