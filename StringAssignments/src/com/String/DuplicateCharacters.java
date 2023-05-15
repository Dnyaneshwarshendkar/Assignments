package com.String;

import java.util.HashMap;

public class DuplicateCharacters 
	{
	   public static void main(String[] args) {
	     String str = "Dnyaneshwar";
	     HashMap<Character, Integer> charCountMap = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }
	        for (Character c : charCountMap.keySet()) {
	            if (charCountMap.get(c) > 1) {
	                System.out.println(c + ": " + charCountMap.get(c));
	            }
	        }
	    }
	}



