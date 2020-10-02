package com.thearchermancoding.core;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Order.
 */
public class Order {
    private ArrayList<OrderItem> contents;
    private OrderState state;
    private boolean active;

    /**
     * Instantiates a new Order.
     */
    public Order() {
        this(new ArrayList<OrderItem>(), OrderState.OPEN);
    }

    /**
     * Instantiates a new Order.
     *
     * @param contents the contents
     * @param state    the state
     */
    public Order(ArrayList<OrderItem> contents, OrderState state) {
        this.contents = contents;
        this.state = state;
        this.active = this.state.isActive();
    }

    /**
     * Add item.
     *
     * @param item the item
     */
    public void addItem(OrderItem item) {
        contents.add(item);
    }

    public void addItems() {
        Scanner scan = new Scanner(System.in);
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public OrderState getState() {
        return state;
    }

    /**
     * Gets contents.
     *
     * @return the contents
     */
    public ArrayList<OrderItem> getContents() {
        return contents;
    }

    /**
     * Is active boolean.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Change state.
     *
     * @param state the state
     */
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
