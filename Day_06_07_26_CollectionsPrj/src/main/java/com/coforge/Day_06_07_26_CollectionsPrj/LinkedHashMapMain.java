package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.LinkedHashMap;
import java.util.Iterator;
//import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMain {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
        lmap.put(1, "apple");
        lmap.put(32, "orange");
        lmap.put(5, "banana");
        lmap.put(65, "watermelon");
        
        System.out.println(lmap); 

        lmap.put(5, "pineapple"); // Updates value but does NOT change its position in order
        System.out.println(lmap);

        System.out.println("Get value for key 65: " + lmap.get(65));
        System.out.println("Contains key 7?: " + lmap.containsKey(7));
        System.out.println("Contains value 'orange'?: " + lmap.containsValue("orange"));
        
        System.out.println("Get or default (key 99): " + lmap.getOrDefault(99, "No Fruit Found"));

        lmap.putIfAbsent(5, "mango");  // Ignored because key 5 already exists
        lmap.putIfAbsent(7, "grapes"); // Added at the very end of the insertion chain
        System.out.println(lmap);

        lmap.replace(7, "guava");
        System.out.println("After replacing key 7: " + lmap);

        lmap.put(null, "kiwi"); // LinkedHashMap allows one null key and multiple null values
        lmap.put(12, null);
        System.out.println(lmap);

        System.out.println("Keys: " + lmap.keySet());
        System.out.println("Values: " + lmap.values());
//Iteration
        Set<Entry<Integer, String>> entries = lmap.entrySet();
        System.out.println("Total entry count: " + entries.size());
        
        Iterator<Entry<Integer, String>> itr = entries.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()); 
        }

        lmap.clear();
        System.out.println("Is map empty after clear()?: " + lmap.isEmpty());
    }
}