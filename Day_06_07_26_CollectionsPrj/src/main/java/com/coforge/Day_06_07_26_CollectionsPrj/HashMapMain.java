package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"apple");
		map.put(32, "orange");
		map.put(5, "banana");
		map.put(65, "watermelon");
		System.out.println(map);
		map.put(5, "pineapple");
		System.out.println(map);
		map.put(7, "orange");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.get(7));
		
		System.out.println(map.containsKey(65));
		System.out.println(map.containsValue("orange"));
		System.out.println(map.getOrDefault(66,"no fruit"));
		System.out.println(map);
		map.put(66, "no fruit");
		System.out.println(map);
		map.replace(66, "guava");
		System.out.println(map);
		map.put(78, null);
		map.put(2, null);
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		map.put(null, "kiwi");
		System.out.println(map);
		System.out.println(map.get(null));
		
		Set<Entry<Integer,String>> entries = map.entrySet();
		System.out.println(entries.size());
		Iterator<Entry<Integer,String>> itr = entries.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Is map empty?: " + map.isEmpty());
        System.out.println("Current Size: " + map.size());
		
        map.putIfAbsent(5, "mango");  
        map.putIfAbsent(10, "grapes"); // Key 10 doesn't exist, so it will be added
        System.out.println("After putIfAbsent: " + map);
        boolean removed1 = map.remove(32, "apple");  // Fails: Key 32 maps to orange, not apple
        boolean removed2 = map.remove(32, "orange"); // Succeeds: Exact match
        System.out.println("Removed (32, 'apple')?: " + removed1);
        System.out.println("Removed (32, 'orange')?: " + removed2);
        
        map.clear(); // Wipes out all elements inside the map instance
        System.out.println("After clear(), size is: " + map.size());
        System.out.println("Final map: " + map);
	}

}
