package com.String;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter a string: ");
         String inputString = scanner.nextLine();

           String outputString = "";
	        for (int i = 0; i < inputString.length(); i++) {
	            char c = inputString.charAt(i);
	            if (Character.isUpperCase(c)) {
	                outputString += Character.toLowerCase(c);
	            } else if (Character.isLowerCase(c)) {
	                outputString += Character.toUpperCase(c);
	            } else {
	                outputString += c;
	            }
	        }

	        System.out.println("Original string: " + inputString);
	        System.out.println("New string: " + outputString);
	    }
	}


