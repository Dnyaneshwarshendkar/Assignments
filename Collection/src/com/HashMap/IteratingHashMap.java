package com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		
	HashMap<String,Double> map= new HashMap<>();
	map.put("suraj", 67.8);	
	map.put("Ravi", 89.0);	
	map.put("Deep", 56.0);	
	map.put("sheth", 89.8);	
	map.put("vaibhav", 94.8);	
	
	System.out.println(map);
	
	
	System.out.println("=========================");
	
	Set<String> keyset=map.keySet();
	
	for(String s:keyset)
	{
		System.out.println(s);
	}
	
	System.out.println("==========================");
	
	
	Collection<Double> marks=map.values();
	
	for(Double m:marks)
	{
		System.out.println(m);
	}
	
	System.out.println("===========================");
	
	Set<String>keys=map.keySet();
	
	Iterator<String> itr=keys.iterator();
	
	while(itr.hasNext())
	{
		String k=itr.next();
		System.out.println(k+"  :"+map.get(k));
	}
	 System.out.println("=========================");
	
	 
	 
	 
	}

}
