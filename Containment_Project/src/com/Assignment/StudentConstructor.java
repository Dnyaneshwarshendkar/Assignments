package com.Assignment;

public class StudentConstructor {

	public static void main(String[] args) {
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(101,"Dnyanesh",22,new Course(1,"Java",800));
		stud[1]=new Student(102,"Mauli",23,new Course(2,"SQL",900));
		stud[2]=new Student(103,"Jerry",23,new Course(3,"payhon",700));
		stud[3]=new Student(104,"marry",22,new Course(4,"HTML",800));
		
		for(Student s:stud)
		{
			System.out.println(s);
		}

	}

}
