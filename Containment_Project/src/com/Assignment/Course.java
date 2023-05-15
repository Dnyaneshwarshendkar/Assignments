package com.Assignment;

public class Course {
	
	private int id;
	private String name;
	private double fees;
	
	Course()
	{
		
	}
	
	Course(int id,String name,double fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
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
	
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public double getFees()
	{
		return fees;
	}
	
	public String toString()
	{
		return +id+" "+name+" "+fees;
	}
	
	
}
