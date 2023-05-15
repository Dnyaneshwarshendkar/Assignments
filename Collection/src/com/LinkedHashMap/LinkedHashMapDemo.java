package com.LinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String ,Double> lmap=new LinkedHashMap<>();
		
		lmap.put("Dnyanesh", 78.5);
		lmap.put("Priya", 74.7);
		lmap.put("Vivek", 89.0);
		lmap.put(null, 0.0);
		
		for(Map.Entry<String, Double> en: lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		System.out.println("=======================");
		
		//keys
		
		Set<String>names=lmap.keySet();
		Iterator<String>itr=names.iterator();
		
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+" "+lmap.get(k));
		}
		
		System.out.println("========================");
		
		//values
		Collection<Double>marks=lmap.values();
		Iterator<Double>itr1=marks.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("======================");
		System.out.println(+lmap.get("vivek"));
		
		for(Map.Entry<String, Double> en:lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
