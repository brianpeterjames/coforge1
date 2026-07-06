package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {
	public static void main(String []args) {
	//TreeSet<Product> productTree = new TreeSet<>();
//	productTree.add(new Product(105, "Wireless Mouse", 1200.00, 15));
//	productTree.add(new Product(101, "Mechanical Keyboard", 4500.00, 8));
//	productTree.add(new Product(108, "Gaming Monitor", 22000.00, 4));
//	productTree.add(new Product(103, "USB-C Hub", 2500.00, 20));
//	productTree.add(new Product(110, "External SSD 1TB", 8500.00, 12));
//	productTree.add(new Product(102, "HD Webcam", 3800.00, 6));
//	productTree.add(new Product(107, "Noise Cancelling Headphones", 15000.00, 10));
//	productTree.add(new Product(104, "Ergonomic Office Chair", 18500.00, 3));
//	productTree.add(new Product(109, "Bluetooth Speaker", 5500.00, 14));
//	productTree.add(new Product(106, "Laptop Stand", 1900.00, 25));
//	
//	for(Product p:productTree)
//		System.out.println(p);
	TreeSet<Integer> tree = new TreeSet<Integer>();
	tree.add(67);
	tree.add(34);
	tree.add(90);
	tree.add(31);
	tree.add(89);
	tree.add(11);
	tree.add(56);
	tree.add(99);
	System.out.println(tree);
	Set<Integer> set = tree.descendingSet();
	System.out.println(set);
	Iterator<Integer> itr = tree.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("*****************");
	System.out.println(tree.higher(28));
	System.out.println("*****************");
	System.out.println(tree.ceiling(28)); //return nearest large element 
	System.out.println("*****************");
	System.out.println(tree.floor(28)); // return nearest small element 
	System.out.println("*****************");
	System.out.println(tree.floor(10));// no further minimum, null will be returned 
	System.out.println("*****************");
	System.out.println(tree.lower(28));
	System.out.println("*****************");
	System.out.println(tree.higher(28));
	System.out.println("*****************");
	System.out.println(tree.lower(31));
	System.out.println("*****************");
	System.out.println(tree.higher(31));
	System.out.println("*****************");
	System.out.println(tree.floor(31));
	
	System.out.println("*****************");
	System.out.println(tree.ceiling(99));
	System.out.println("*****************");
	System.out.println(tree.floor(89));
	}
}
