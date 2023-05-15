package com.Stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackElement {

	public static void main(String[] args) {
		
		Stack<String>stk=new Stack<>();
		stk.push("Apple");
		stk.push("Banana");
		stk.push("orange");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		
		System.out.println(stk.pop());
		
		System.out.println(stk);
		
		System.out.println(stk.search("Banana"));
		
	//	Enumeration<String> en=stk.elements();
		
	//	while(en.hasMoreElements())
	//	{
	//		System.out.println(en);
	//	}
		
		
	}

}
