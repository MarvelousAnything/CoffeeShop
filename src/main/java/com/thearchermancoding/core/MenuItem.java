package com.thearchermancoding.core;

import org.json.simple.JSONObject;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem() {
        this("default", 0.00, "");
    }

    public MenuItem(String name, double price) {
        this(name, price, "");
    }

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = Math.round(price * 100.0) / 100.0;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.round(price * 100.0) / 100.0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static MenuItem fromJSON(JSONObject item) {
        return new MenuItem((String) item.get("name"), (double) item.get("price"), (String) item.get("description"));
    }
}
