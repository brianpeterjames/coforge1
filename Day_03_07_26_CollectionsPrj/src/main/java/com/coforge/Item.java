package com.coforge;

public class Item {
	private String itemName;
	private int itemId;
	private double itemCost;
	public Item()
	{
		super();
	}
	
	public Item(String itemName, int itemId, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.itemCost = itemCost;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemId=" + itemId + ", itemCost=" + itemCost + "]";
	}

	

//	@Override
//	public int compareTo(Item o) {
//		// TODO Auto-generated method stub
//		return (int)( o.getItemCost()-this.getItemCost());
//	}
	

}
