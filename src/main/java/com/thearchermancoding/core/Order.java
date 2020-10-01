package com.thearchermancoding.core;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> contents;
    private OrderState state;
    private boolean active;

    public Order() {
        this(new ArrayList<OrderItem>(), OrderState.OPEN);
    }

    public Order(ArrayList<OrderItem> contents, OrderState state) {
        this.contents = contents;
        this.state = state;
        this.active = this.state.isActive();
    }

    public void addItem(OrderItem item) {
        contents.add(item);
    }

    public OrderState getState() {
        return state;
    }

    public ArrayList<OrderItem> getContents() {
        return contents;
    }

    public boolean isActive() {
        return active;
    }

    public void changeState(OrderState state) {
        this.state = state;
        this.active = this.state.isActive();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (MenuItem content : this.contents) {
            out.append(content).append(", ");
        }
        return out.toString();
    }
}
