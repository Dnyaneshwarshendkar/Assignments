package com.Assignment;

public class StudentConstructors2 {

	public static void main(String[] args) {
		
		Course cr[]=new Course[4];
		
		cr[0]=new Course(1,"Java",800);
		cr[1]=new Course(2,"python",1000);
		cr[2]=new Course(3,"SQL",9000);
		
		Student stud[]=new Student[4];
		
		stud[0]=new Student(101,"Dnyanesh",22,cr[0]);
		stud[1]=new Student(102,"Ganesh",23,cr[1]);
		stud[2]=new Student(103,"Sanchit",19,cr[2]);
		stud[3]=new Student(104,"Avinash",21,cr[3]);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}

}
