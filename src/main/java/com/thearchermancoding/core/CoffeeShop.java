package com.thearchermancoding.core;

import java.util.ArrayList;

/**
 * The type Coffee shop.
 */
public class CoffeeShop {
    private String name;
    private String address;
    private ArrayList<Employee> employees;
    private Menu menu;

    /**
     * Instantiates a new Coffee shop.
     *
     * @param name      the name
     * @param address   the address
     * @param employees the employees
     * @param menu      the menu
     */
    public CoffeeShop(String name, String address, ArrayList<Employee> employees, Menu menu) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.menu = menu;
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
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets employees.
     *
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Sets employees.
     *
     * @param employees the employees
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    /**
     * Gets menu.
     *
     * @return the menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Sets menu.
     *
     * @param menu the menu
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
