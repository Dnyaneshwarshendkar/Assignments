package com.Sort2;

import java.util.HashMap;

public class SortHashMapDemo {
	
	public static void 

	public static void main(String[] args) {
		
		Course c1=new Course(1,"Java");
		Course c2=new Course(2,"Dot Net");
		Course c3=new Course(3,"Python");
	
		
		HashMap<Student,Course> map=new HashMap<>();
		
		map.put(new Student(101,"Dnyanesh", 450f),c1);
		map.put(new Student(102,"Rushi", 250f),c2);
		map.put(new Student(103,"sanket", 450f),c3);
		map.put(new Student(104,"manish", 750f),c2);
		map.put(new Student(105,"suraj", 400f),c3);
		map.put(new Student(106,"sanchit", 850f),c1);
		
		
	}

}
