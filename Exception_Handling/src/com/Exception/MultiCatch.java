package com.Exception;

public class MultiCatch {
	
 	try
	{
		int a=10/0;
	}
 	
 	catch(Throwable e)
 	{
 		System.out.println("catch block Throwable");
 	}
 	catch(Exception a)
 	{
 		System.out.println("catch block of exception");
 	}
 	catch(Arithmetic Exception b)
 	{
 		System.out.println("Arithmetic Exception");
 	}
 	
 	
 	
 	
}
