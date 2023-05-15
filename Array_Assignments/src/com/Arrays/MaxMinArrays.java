package com.Arrays;

import java.util.Scanner;

public class MaxMinArrays {
	
	public static void main(String[] args) {
	    
	     Scanner sc= new Scanner(System.in);
	     
	     int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
	     
	     int ar[]= new int[5];
	     
	     for(int i=0;i<ar.length;i++)
			{
				ar[i]= sc.nextInt();
				
				if(ar[i]>max)
					max= ar[i];
				if(ar[i]<min)
					min=ar[i];
			}

	      System.out.println(max+" "+min);
	     

		}
}
