package com.ArrayList;

import java.util.ArrayList;
import java.util.List;
public class NonGenericArrayList {

	public static void main(String[] args) {
		
		List list1=new ArrayList<>(); 
		
		list1.add(50);
		list1.add("Dnyanesh");
		list1.add(78.8f);
		list1.add('P');
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data=(int)list1.get(i)+10;
			list1.set(i, list1);
		}
		System.out.println(list1);
	}

}
