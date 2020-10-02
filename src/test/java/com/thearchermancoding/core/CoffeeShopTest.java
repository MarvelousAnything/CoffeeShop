package com.thearchermancoding.core;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CoffeeShopTest {
    //TODO: Add more creative parameters for tests
    private CoffeeShop testshop;
    private Customer customer;
    @Before
    public void setUp() throws Exception {
        this.testshop = new CoffeeShop();
        testshop.addEmployee(new Employee(testshop));
        testshop.setMenu(new Menu("menu.json"));
    }

    @Test
    public void getName() {
        assertEquals("A Coffee Shop", testshop.getName());
    }

    @Test
    public void setName() {
        testshop.setName("testshop");
        assertEquals("testshop", testshop.getName());
    }

    @Test
    public void getAddress() {
        assertEquals("12345 123th ave E", testshop.getAddress());
    }

    @Test
    public void setAddress() {
        testshop.setAddress("test");
        assertEquals("test", testshop.getAddress());
    }

    @Test
    public void getEmployees() {
        ArrayList<Employee> employees = testshop.getEmployees();
        StringBuilder actual = new StringBuilder();
        for (Employee employee : employees) {
            actual.append(employee.toString());
        }
        assertEquals("Employee{jobTitle=barista, employer=A Coffee Shop}", actual.toString());
    }

    @Test
    public void setEmployees() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(JobTitles.MANAGER, testshop));
        testshop.setEmployees(employees);
        StringBuilder actual = new StringBuilder();
        for (Employee employee : employees) {
            actual.append(employee.toString());
        }
        assertEquals("Employee{jobTitle=manager, employer=A Coffee Shop}", actual.toString());
    }

    @Test
    public void addEmployee() {
        testshop.setEmployees(new ArrayList<Employee>());
        testshop.addEmployee(new Employee(JobTitles.MANAGER, testshop));
        StringBuilder actual = new StringBuilder();
        for (Employee employee : testshop.getEmployees()) {
            actual.append(employee.toString());
        }
        assertEquals("Employee{jobTitle=manager, employer=A Coffee Shop}", actual.toString());
    }

    @Test
    public void getMenu() {
        Menu testmenu = new Menu("menu.json");
        assertEquals(testmenu.toString(), testshop.getMenu().toString());
    }

    @Test
    public void setMenu() {
        testshop.setMenu(new Menu());
        Menu testmenu = new Menu();
        Menu testmenu2 = new Menu("menu.json");
        assertEquals(testmenu.toString(), testshop.getMenu().toString());
        assertNotSame(testmenu2.toString(), testshop.getMenu().toString());
    }
}
