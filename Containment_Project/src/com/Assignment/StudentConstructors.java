package com.Assignment;

public class StudentConstructors {

	public static void main(String[] args) {
		
		Course c1=new Course(1,"Java",8000);
		Course c2=new Course(2,"python",1000);
		
		Student stud[]=new Student[5];
		
		stud[0]=new Student(101,"snehal",22,c1);
		stud[1]=new Student(102,"Dnyanesh",23,c2);
		stud[2]=new Student(103,"Vaibhav",22,c2);
		stud[3]=new Student(104,"Ganesh",21,c2);
		stud[4]=new Student(105,"gaurav",24,c2);
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
	}

}
