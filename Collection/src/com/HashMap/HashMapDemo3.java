package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h1= new HashMap<>();
		
		h1.put(1,"Ramesh");
		h1.put(2, "ganesh");
		h1.put(3, "manesh");
		
		Set<Integer> keyset=h1.keySet();
		
	}

}
