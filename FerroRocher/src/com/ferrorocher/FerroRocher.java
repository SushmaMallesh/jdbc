package com.ferrorocher;

public class FerroRocher {

	String brand;
	int price;
	
	FerroRocher(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
		
	}
	void display()
	{
		System.out.println(brand+ " "+price);
	}
}
  