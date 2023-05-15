package com.practice;

public class Item {
	
	private int id;
	private String name;
	private double unitprice;
	//private Item();
	//super();
	
	public Item(int id,String name,double unitprice)
	{
		super();
		this.id=id;
		this.name=name;
		this.unitprice=unitprice;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getUnitprice()
	{
		return unitprice;
	}
	public void setUnitprice(double unitprice)
	{
		this.unitprice=unitprice;
	}
	
	public String toString()
	{
		return +id+" "+name+" "+unitprice;
	}
}
