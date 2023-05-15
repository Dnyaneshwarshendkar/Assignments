package com.Exception;

public class Demo {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("from try block");
			int a=10/0;
			char[] e =null;
			System.out.println(e);
		}
		catch(ArithmeticException  e)
		{
			System.out.println("check block exception");
		}
		System.out.println("normal flow...");

	}

}
