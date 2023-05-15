package com.Arrays;

import java.util.Scanner;

public class primeNumber1 {
	
	public static boolean checkPrime(int num)
	{
		boolean status=true;
		
		if((num==0)||(num==1))
		{
			status= false;
			//System.out.println(num+" is not a prime number");
		}
		
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					//System.out.println(num+" is not a prime number");
					status= false;
					break;
					
				}
			}
			/*
			if(status)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}*/
			
			
		}
		return status;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		boolean isPrime=checkPrime(num);
		
	}
}
