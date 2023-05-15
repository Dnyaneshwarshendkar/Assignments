package com.Assignment;

import java.util.Scanner;

public class StudentGetterSetter {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterDetails(Student s) {
	System.out.println("Enter the id:");
	s.setId(sc.nextInt());
	

	}

}
