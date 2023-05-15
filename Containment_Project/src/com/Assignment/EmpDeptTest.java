package com.Assignment;

import java.util.Scanner;

public class EmpDeptTest {
	
	static Scanner sc = new Scanner(System.in);

	public static void enterEmpDetail(Employee [] emp1) {
		
		System.out.println("Enter the employee id");
		emp1.setEid(sc.nextInt());
		
		System.out.println("Enter the Employe Name");
		emp1.setName(sc.next());

		System.out.println("Enter the Employe Salary ");
		emp1.setSalary(sc.nextFloat());

	}

	public static void highestSalary(Employee emp[]) {
		float max = Float.MIN_VALUE;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEsalary() > max) {
				max = (float) emp[i].getEsalary();
			}
		}
		System.out.println("Highest salary = " + max);

	}

	public static void printhighestSalary(Employee emp[]) {
		System.out.println("==========================");
		for (Employee e : emp) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Department d[] = new Department[5];
		
		  d[0] = new Department(1, "Production"); 
		  d[1] = new Department(2,"Markering");
		  d[2] = new Department(3, "Finance");
		  
		  Employee emp[] = new Employee[8];
		  
		  emp[0] = new Employee(1, "Dnyanesh", 85000); 
		  emp[1] = new Employee(2,"Ganesh",34000);
		  emp[2] = new Employee(3, "Rohan", 56000); 
		  emp[3] = new Employee(4, "Ganesh", 12000);
		  emp[4] = new Employee(5,"sanket",3000);
		  emp[5] = new Employee(6,"Abhi",50000); 
		  emp[6] = new Employee(7,"Ram",6000);
		  emp[7] = new Employee(8, "Raju", 32000);
		 

		Employee emp1[] = new Employee[8];
		
		for (int i = 0; i < emp1.length; i++) {
			emp1[i] = new Employee();
			 enterEmpDetail(emp1);
		}

		highestSalary(emp1);

	}

}

