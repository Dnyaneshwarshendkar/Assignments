package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortKey {
	
	public static void keySort(HashMap<String,Double>map)
	{
		ArrayList<String> list=new ArrayList<>(map.keySet());
		
		Collections.sort(list);
		//System.out.println(list);
		
		LinkedHashMap<String,Double> lmap=new LinkedHashMap<>();
		
		for(String s:list)
		{
			
			lmap.put(s,map.get(s));
		}
		
		for(Map.Entry<String,Double>en:lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Double> map=new HashMap<>();
		
		map.put("suraj",89.5);
		map.put("Sahili",90.0);
		map.put("vaibhav", 78.9);
		map.put("Ganesh", 97.0);
		map.put("Rushi", 88.9);
		
		keySort(map);
		
	}

}
