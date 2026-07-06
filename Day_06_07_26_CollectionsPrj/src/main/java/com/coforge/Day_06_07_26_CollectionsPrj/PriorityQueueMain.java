package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueMain {
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(87);
		pq.add(76);
		pq.add(34);
		pq.add(25);
		pq.add(88);
		pq.add(34);
		pq.add(9);
		pq.add(25);
		//System.out.println(pq);
		//System.out.println(pq.poll()); // remove highest priority element 
		//System.out.println(pq.poll()); 
		System.out.println(pq);
		System.out.println(pq.offer(10));
		System.out.println(pq);
		System.out.println(pq.poll()); 
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(89);
		ad.add(67);
		ad.addFirst(45);
		ad.addLast(34);
		
		Integer head = pq.peek();
		System.out.println("Current head element (peek): " + head);
		
		boolean hasEightyEight = pq.contains(88);
		System.out.println("Does queue contain 88?: " + hasEightyEight);
		
		boolean isRemoved = pq.remove(34); // Removes one instance of 34
		System.out.println("Was 34 removed successfully?: " + isRemoved);
		System.out.println("Queue after removal: " + pq);
		
		System.out.println("Current number of elements: " + pq.size());
		
		System.out.println("Is queue empty before clear?: " + pq.isEmpty());
		pq.clear();
		System.out.println("Is queue empty after clear?: " + pq.isEmpty());
		
		ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
		ad1.add(89);
		ad1.add(67);
		ad1.addFirst(45);
		ad1.addLast(34);
		System.out.println(ad1);
	

	}
}
