package com.thearchermancoding.core;

import org.junit.Before;
import org.junit.Test;

public class CoffeeShopTest {
    @Before
    public void setUp() throws Exception {
        CoffeeShop testshop = new CoffeeShop();
        testshop.addEmployee(new Employee(testshop));
        Customer customer = new Customer();
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAddress() {
    }

    @Test
    public void setAddress() {
    }

    @Test
    public void getEmployees() {
    }

    @Test
    public void setEmployees() {
    }

    @Test
    public void getMenu() {
    }

    @Test
    public void setMenu() {
    }
}
