package com.Collection_Revision;

import java.util.ArrayList;

public class UniqueArrayList {
	
	public static void findUnique(ArrayList<String>al)
	{
		int count;
		for(int i=0;i<al.size();i++)
		{
			
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");
		
		System.out.println(list);
		
		System.out.println("Unique elementa are:");
		
		findUnique(list);
	}

}
