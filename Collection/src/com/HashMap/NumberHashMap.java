package com.HashMap;

import java.util.ArrayList;

public class NumberHashMap {
	
	public static String convertWord(int num)
	{
		String word=null;
		
		switch(num)
		{
		case 1:
			word="one";
			break;
		case 2:
			word="two";
			break;
			
		case 3:
			word="three";
			break;
			
		case 4:
			word="four";
			break;
			
		case 5:
			word="five";
			break;
			
		default:
			System.out.println("Error");
		}
		return word;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(1);
		
		
		

	}

}
