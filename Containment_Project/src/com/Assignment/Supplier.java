package com.Assignment;

import java.util.Arrays;

public class Supplier {
	
	private int sid;
	private String sname;
	private double phonenumber;
	private Item items[];
	
	Supplier()
	{
		
	}
	
	Supplier(int sid,String name,double cno,Item Items)
	{
		this.sid=sid;
		this.sname=sname;
		this.phonenumber=phonenumber;
		this.items=items;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(double phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", phonenumber=" + phonenumber + ", items="
				+ Arrays.toString(items) + "]";
	}
	
	
}
