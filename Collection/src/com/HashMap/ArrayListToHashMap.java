package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashMap {
	
	public static void countMap(ArrayList<Employee1> al)
	{
		HashMap<Department,Integer> dmap=new HashMap<>();
		
		for(Employee1 emp:al)
		{
			Department d=emp.getDept();
			if(dmap.containsKey(d))
			{
				dmap.put(d, dmap.get(d)+1);
				
			}
			else
			{
				dmap.put(d, 1);
			}
			
			for(Map.Entry<Department,Integer>en:dmap.entrySet())
			{
				System.out.println(en.getKey().getDname()+"  ->"+en.getValue());
			}
		}
	}

	public static void main(String[] args) {
		
		Department d1=new Department(1,"HR");
		Department d2=new Department(2,"Sales");
		Department d3=new Department(3,"Technical");

		ArrayList<Employee1> list=new ArrayList<>();
		
		list.add(new Employee1(101,"Milind",7000f,d2));
		list.add(new Employee1(102,"Dnyanesh",9000f,d1));
		list.add(new Employee1(103,"Ganesh",8000f,d2));
		list.add(new Employee1(104,"Rushi",6000f,d3));
		list.add(new Employee1(105,"suraj",8000f,d1));
		list.add(new Employee1(106,"sanket",8900f,d3));
		list.add(new Employee1(107,"sagar",9000f,d1));
		list.add(new Employee1(108,"manish",5000f,d1));
		
		countMap(list);
	}

}
