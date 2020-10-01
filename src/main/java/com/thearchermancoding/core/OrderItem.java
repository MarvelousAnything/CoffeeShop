package com.thearchermancoding.core;

/**
 * The type Order item.
 */
public class OrderItem extends MenuItem {
    private int amount = 1;

    /**
     * Instantiates a new Order item.
     */
    public OrderItem() {
        super();
    }

    /**
     * Instantiates a new Order item.
     *
     * @param amount the amount
     */
    public OrderItem(int amount) {
        super();
        this.amount = amount;
    }

    /**
     * Instantiates a new Order item.
     *
     * @param name        the name
     * @param price       the price
     * @param description the description
     * @param amount      the amount
     */
    public OrderItem(String name, double price, String description, int amount) {
        super(name, price, description);
        this.amount = amount;
    }

    /**
     * Instantiates a new Order item.
     *
     * @param name   the name
     * @param price  the price
     * @param amount the amount
     */
    public OrderItem(String name, double price, int amount) {
        super(name, price);
        this.amount = amount;
    }

    /**
     * Instantiates a new Order item.
     *
     * @param item   the item
     * @param amount the amount
     */
    public OrderItem(MenuItem item, int amount) {
        super(item.getName(), item.getPrice(), item.getDescription());
        this.amount = amount;
    }
}
