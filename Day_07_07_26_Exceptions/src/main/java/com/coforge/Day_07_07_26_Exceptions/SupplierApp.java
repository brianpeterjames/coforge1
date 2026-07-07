package com.coforge.Day_07_07_26_Exceptions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;



class Item{
	private int id;
	public int getId() {
		return id;
	}
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
}

public class SupplierApp {

	public static void main(String[] args) {
	//	Supplier<Integer> supplier = ()->(int) Math.round((Math.random()*90000)+1000);
		//System.out.println(supplier.get());
		
//		System.out.println((int) Math.round((Math.random()*90000)+1000));
//		// date related 
//		Supplier<LocalDateTime> timeSupplier = ()->LocalDateTime.now();
//		System.out.println(timeSupplier.get());
		
		java.util.List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(123,"Laptop"));
		itemList.add(new Item(124,"Mouse"));
		itemList.add(new Item(125,"Printer"));
		itemList.add(new Item(126,"PenDrive"));
		
		Supplier<Item> itemSupplier=()->new Item(123,"Laptop");
		System.out.println(itemSupplier.get());
	}

	

}
