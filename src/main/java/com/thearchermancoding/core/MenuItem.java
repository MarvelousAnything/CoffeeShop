package com.thearchermancoding.core;

import org.json.simple.JSONObject;

/**
 * The type Menu item.
 */
public class MenuItem {
    private String name;
    private double price;
    private String description;

    /**
     * Instantiates a new Menu item.
     */
    public MenuItem() {
        this("default", 0.00, "");
    }

    /**
     * Instantiates a new Menu item.
     *
     * @param name  the name
     * @param price the price
     */
    public MenuItem(String name, double price) {
        this(name, price, "");
    }

    /**
     * Instantiates a new Menu item.
     *
     * @param name        the name
     * @param price       the price
     * @param description the description
     */
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = Math.round(price * 100.0) / 100.0;
        this.description = description;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = Math.round(price * 100.0) / 100.0;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * From json menu item.
     *
     * @param item the item
     * @return the menu item
     */
    public static MenuItem fromJSON(JSONObject item) {
        return new MenuItem((String) item.get("name"), (double) item.get("price"), (String) item.get("description"));
    }

    public String toString() {
        return this.name + "\t\t$" + this.price;
    }
}
