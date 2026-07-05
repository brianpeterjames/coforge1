package com.coforge;

import java.util.ArrayList;

public class ItemsMainClass{
	public static void main(String[]args)
	{
		ArrayList<Item> itemList = new ArrayList<Item>();
		Item laptop = new Item("Dell",12345,65000);
		Item mouse = new Item("Logitech",6754,900);
		Item printer = new Item("Canon",5432,5000);
		itemList.add(laptop);
		itemList.add(mouse);
		itemList.add(printer);
		System.out.println(itemList);
		
	}
	
	
}
