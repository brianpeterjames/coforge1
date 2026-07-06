package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Iterator;
import java.util.Stack;

public class StackMain {
	public static void main(String []args)
	{
		// follows LIFO 
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=1;i<=10;i++)
		{
			stack.push((int)(Math.round(Math.random()*10)));
		}
		System.out.println(stack);
		System.out.println(stack.search(4));
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println("Search for 4 (1-indexed from top): " + stack.search(4));
		
		// pop(): Removes and returns the top element of the stack
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Stack after pop: " + stack);
		
		System.out.println("\n--- Remaining Stack Methods ---");

		if (!stack.isEmpty()) { 
			System.out.println("Top element (peek): " + stack.peek());
		}

		System.out.println("Is stack empty? (using empty()): " + stack.empty());

		System.out.println("Current Stack Size: " + stack.size());

		System.out.print("Stack items from bottom to top: ");
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		System.out.print("Popping remaining elements until empty: ");
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println("\nFinal Stack state: " + stack);
	}
}
