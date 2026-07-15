package com.coforge.beans;

public class Order {
    private int orderId;
    private double orderCost;
    private Item item;

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Order(int orderId, double orderCost, Item item) {
        super();
        this.orderId = orderId;
        this.orderCost = orderCost;
        this.item = item;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderCost=" + orderCost + ", item=" + item + "]";
    }
}