package com.Arrays;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrime(int num)
	{
		boolean status=true;
		if((num==0)||(num==1))
		{
			status=false;
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					status=false;
					break;
				}
			}
			return status;
		}
		return status;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		boolean isPrime=checkPrime(num);
	}

}
