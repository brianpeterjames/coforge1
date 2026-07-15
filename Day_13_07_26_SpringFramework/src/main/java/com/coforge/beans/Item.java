package com.coforge.beans;

public class Item {
    private int itemId;
    private String itemName;
    private double itemCost;

    // 1. CRITICAL: Spring needs this no-arg constructor for setter injection
    public Item() {
    }

    // Constructor for item1 and item2 (Constructor Injection)
    public Item(int itemId, String itemName, double itemCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    // 2. CRITICAL: Spring looks for this exact name for <property name="itemId">
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    // Don't forget your getters and toString() method!
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCost=" + itemCost + "]";
    }
}
