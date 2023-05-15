package com.customtreemap;

import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Customer,Order> tmap=new TreeMap<>();
		
		tmap.put(new Customer(1,"Prashant",7890564535),new Order(101,"Laptop",90888f));
		tmap.put(new Customer(4,"Dnyanesh",8967543219),new Order(102,"Pendrive",860f));
	}

}
