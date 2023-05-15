package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("HTML");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al);
		}
		
		System.out.println("===================");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		
		Iterator<String>itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator<String>litr=al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}

}
