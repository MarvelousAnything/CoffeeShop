package com.thearchermancoding.core;

import java.util.ArrayList;

/**
 * The type Customer.
 */
public class Customer extends Person {
    private ArrayList<Order> orders = new ArrayList<Order>();

    /**
     * Place order.
     *
     * @param order the order
     */
    public void placeOrder(Order order) {
        order.addItems(this.getCurrentCoffeeShop().getMenu());
        orders.add(order);
    }

    public Order getOrder(int id) {
        return orders.get(id);
    }

    public void addItemToOrder(int orderId, OrderItem item) {
        orders.get(orderId).addItem(item);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
