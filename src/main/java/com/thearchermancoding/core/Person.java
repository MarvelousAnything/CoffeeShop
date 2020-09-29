package com.thearchermancoding.core;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String email;
    private final int id;

    public Person() {
        this("John", "Smith", "john@smith.com", 0);
    }

    public Person(String firstName, String lastName, String email, int id) {
        this(firstName, lastName, id);
        this.email = email;
    }
    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
