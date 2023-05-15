package com.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class GenericArrayList {

   public static void main(String[] args) {
		
	List<Integer>list1=new ArrayList<>();
	
	//List<Integer> list1 = null;
	list1.add(12);
	list1.add(90);
	list1.add(89);
	list1.add(67);
	
	
	for(int i=0;i<list1.size();i++)
	{
		System.out.println(list1.get(i));
		int data=list1.get(i)+10;
		list1.set(i, data);
	}
	

	System.out.println(list1);
	
	for(Integer i:list1)
	{
		System.out.println(i);
	}
	
 }
}
