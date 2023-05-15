package com.customtreemap;

public class Order {
	
	private int oid;
	private String name;
	private float price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int oid, String name, float price) {
		super();
		this.oid = oid;
		this.name = name;
		this.price = price;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
