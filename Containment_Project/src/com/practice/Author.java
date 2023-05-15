package com.practice;

public class Author {
	
	private int aid;
	private String aname;
	
	Author()
	{
		
	}
	
	Author(int id,String aname)
	{
		this.aid=aid;
		this.aname=aname;
	}
	
	public int getAid()
	{
		return aid;
	}
	public void setAid(int aid)
	{
		this.aid=aid;
	}
	
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname=aname;
	}
	
	public String toString()
	{
		return aid+" "+aname;
	}
	
	
}
