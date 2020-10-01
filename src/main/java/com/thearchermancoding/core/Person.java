package com.thearchermancoding.core;

/**
 * The type Person.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;
    private final int id;
    private double balance;
    private CoffeeShop currentCoffeeShop;

    /**
     * Instantiates a new Person.
     */
    public Person() {
        this("John", "Smith", "john@smith.com", 0, 100.00);
    }

    /**
     * Instantiates a new Person.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     * @param id        the id
     * @param balance   the balance
     */
    public Person(String firstName, String lastName, String email, int id, double balance) {
        this(firstName, lastName, id, balance);
        this.email = email;
    }

    /**
     * Instantiates a new Person.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param id        the id
     * @param balance   the balance
     */
    public Person(String firstName, String lastName, int id, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = Math.round(balance * 100.0) / 100.0;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Make order.
     */
    public void makeOrder() {

    }
}
