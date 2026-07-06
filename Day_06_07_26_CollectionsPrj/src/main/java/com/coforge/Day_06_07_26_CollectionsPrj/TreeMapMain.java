package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Set;
import java.util.TreeMap;


public class TreeMapMain {

	public static void main(String[] args) {
		TreeMap<Integer, Product> productMap = new TreeMap<Integer, Product>();
		productMap.put(105, new Product(105, "Wireless Mouse", 1200.00, 15));
        productMap.put(101, new Product(101, "Mechanical Keyboard", 4500.00, 8));
        productMap.put(108, new Product(108, "Gaming Monitor", 22000.00, 4));
        productMap.put(103, new Product(103, "USB-C Hub", 2500.00, 20));
        productMap.put(110, new Product(110, "External SSD 1TB", 8500.00, 12));
        productMap.put(102, new Product(102, "HD Webcam", 3800.00, 6));
        productMap.put(107, new Product(107, "Noise Cancelling Headphones", 15000.00, 10));
        productMap.put(104, new Product(104, "Ergonomic Office Chair", 18500.00, 3));
        productMap.put(109, new Product(109, "Bluetooth Speaker", 5500.00, 14));
        productMap.put(106, new Product(106, "Laptop Stand", 1900.00, 25));
        
        for(java.util.Map.Entry<Integer, Product> entry:productMap.entrySet())
        {
        	System.out.println(entry);
        }
        Set<Integer> set = productMap.descendingKeySet();
        for(Integer s:set)
        {
        	System.out.println(s);
        }
        System.out.println("Lowest Key in Map: " + productMap.firstKey()); 
        System.out.println("Highest Key in Map: " + productMap.lastKey()); 
        System.out.println("First Entry: " + productMap.firstEntry());
        System.out.println("Last Entry: " + productMap.lastEntry());
        
        System.out.println("floorEntry(105): " + productMap.floorEntry(105)); 
        System.out.println("lowerEntry(105): " + productMap.lowerEntry(105)); 
        System.out.println("ceilingEntry(105): " + productMap.ceilingEntry(105));
        
        System.out.println("Removing First Entry: " + productMap.pollFirstEntry()); 
        System.out.println("Removing Last Entry: " + productMap.pollLastEntry());
	}

}
