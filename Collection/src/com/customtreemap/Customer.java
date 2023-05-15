package com.customtreemap;

public class Customer {

	private int cid;
	private String name;
	private long MobileNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cid, String name, long mobileNo) {
		super();
		this.cid = cid;
		this.name = name;
		MobileNo = mobileNo;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", MobileNo=" + MobileNo + "]";
	}
	
	
	
	

}
