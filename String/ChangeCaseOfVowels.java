package com.String;

import java.util.Scanner;

public class ChangeCaseOfVowels
	{
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        
	        String result = changeVowelCase(input);
	        System.out.println("Result: " + result);
	    }
	    
	    public static String changeVowelCase(String input) 
	    {
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < input.length(); i++) 
	        {
	            char c = input.charAt(i);
	            if (isVowel(c))
	            {
	                c = toggleCase(c);
	            }
	            output.append(c);
	        }
	        return output.toString();
	    }
	    
	    public static boolean isVowel(char c) 
	    {
	        return "AEIOUaeiou".indexOf(c) != -1;
	    }
	    
	    public static char toggleCase(char c) {
	        if (Character.isUpperCase(c)) 
	        {
	            return Character.toLowerCase(c);
	        } else 
	        {
	            return Character.toUpperCase(c);
	        }
	    }
	}


