package com.Arrays;

public class SearchingArray {
	
	public static boolean search(int ar[],int value)
	{
		boolean isPresent=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==value)
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
		
	}

	public static void main(String[] args) 
	{
		int arr1[]= {4,6,7,2,5,1,10};
		
		boolean isP=search(arr1,7);
		
		if(isP)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}

	}

}
