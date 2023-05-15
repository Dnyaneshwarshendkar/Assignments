package com.Mobile_Management;

public class Mobile 
{
	private int id;
	private String name;
	private String brand;
	private float price;
	
	public Mobile()
	{
		
	}
	
	public Mobile(int id,String name,String brand,float price)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return id+" "+name+" "+brand+" "+price;
	}
}
