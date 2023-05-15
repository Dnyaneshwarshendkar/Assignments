package com.String;

import java.util.Scanner;

public class ReplaceVowels1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String newStr = str.replaceAll("[aeiouAEIOU]","*");

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);

	}

}
