package com.thearchermancoding.core;

public class OrderItem extends MenuItem {
    private int amount = 1;

    public OrderItem() {
        super();
    }
    public OrderItem(int amount) {
        super();
        this.amount = amount;
    }

    public OrderItem(String name, double price, String description, int amount) {
        super(name, price, description);
        this.amount = amount;
    }

    public OrderItem(String name, double price, int amount) {
        super(name, price);
        this.amount = amount;
    }

    public OrderItem(MenuItem item, int amount) {
        super(item.getName(), item.getPrice(), item.getDescription());
        this.amount = amount;
    }
}
