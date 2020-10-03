package com.thearchermancoding.core;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderItemTest {

    private OrderItem item;

    @Before
    public void setUp() throws Exception {
        item = new OrderItem(5);
    }

    @Test
    public void getName() {
        assertEquals("default", this.item.getName());
    }

    @Test
    public void setName() {
        this.item.setName("testname");
        assertEquals("testname", this.item.getName());
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void setPrice() {
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void fromJSON() {
    }
}