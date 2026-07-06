package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.HashSet;

public class SetMain {
	public static void main(String[] args)
	{
	HashSet<Integer> hset = new HashSet<Integer>();
	hset.add(67);
	hset.add(45);
	hset.add(12);
	hset.add(89);
	hset.add(12); // insertion order not followed , no duplicates allowed 
	hset.add(56);
	hset.add(12);
	hset.add(null);
	hset.add(null);// multiple null values not possible 
	System.out.println(hset);
	HashSet<Integer> hset2 = new HashSet<Integer>();
	hset2.add(65);
	hset2.add(85);
	hset2.add(13);
	hset2.add(1);
	hset2.add(89); // insertion order not followed , no duplicates allowed 
	hset2.add(121);
	hset2.add(56);
	hset2.add(null);
	hset.retainAll(hset2); // will update hset with common elements 
	System.out.println(hset);
	Object[] obj= hset.toArray();
	
	for(Object i:obj)
	{
		System.out.println(i);
	}
	// complete all operations on HashSet and LinkedHashSet 
	System.out.println("Size of hset: " + hset.size());
    System.out.println(hset2.contains(45));
    System.out.println(hset2.contains(89));
    System.out.println(hset.isEmpty());
    
    hset2.remove(85);
    HashSet<Integer> unionSet = new HashSet<>(hset);
    unionSet.addAll(hset2);
    System.out.println("Union (addAll): " + unionSet);
    hset.clear();
    System.out.println("After clear(), is hset empty?: " + hset.isEmpty());
	}
	
}
