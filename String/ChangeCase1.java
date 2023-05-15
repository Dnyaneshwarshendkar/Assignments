package com.String;

public class ChangeCase1 {
	
	public static void main(String[] args) {
		
		 String str = "JaVa- jAvA";
	        String newStr = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	           
	            if (Character.isUpperCase(c))
	            {
	                newStr += Character.toLowerCase(c);
	            } 
	            else 
	            {
	                newStr += Character.toUpperCase(c);
	            }
	        }
	        
	        System.out.println(newStr); 
	    }

}
