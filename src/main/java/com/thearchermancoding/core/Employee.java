package com.thearchermancoding.core;

/**
 * The type Employee.
 */
public class Employee extends Person {
    private JobTitles jobTitle;
    private CoffeeShop employer;

    /**
     * Instantiates a new Employee.
     */
    public Employee() {
        super();
        this.jobTitle = JobTitles.BARISTA;
        this.employer = new CoffeeShop();
    }

    /**
     * Instantiates a new Employee.
     *
     * @param jobTitle the job title
     * @param employer the employer
     */
    public Employee(JobTitles jobTitle, CoffeeShop employer) {
        super();
        this.jobTitle = jobTitle;
        this.employer = employer;
    }

    public Employee(CoffeeShop employer) {
        super();
        this.jobTitle = JobTitles.BARISTA;
        this.employer = employer;
    }

    /**
     * Instantiates a new Employee.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param id        the id
     * @param balance   the balance
     * @param jobTitle  the job title
     * @param employer  the employer
     */
    public Employee(String firstName, String lastName, int id, double balance, JobTitles jobTitle, CoffeeShop employer) {
        super(firstName, lastName, id, balance);
        this.jobTitle = jobTitle;
        this.employer = employer;
    }

    /**
     * Gets job title.
     *
     * @return the job title
     */
    public JobTitles getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets job title.
     *
     * @param jobTitle the job title
     */
    public void setJobTitle(JobTitles jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Gets employer.
     *
     * @return the employer
     */
    public CoffeeShop getEmployer() {
        return employer;
    }

    /**
     * Sets employer.
     *
     * @param employer the employer
     */
    public void setEmployer(CoffeeShop employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle=" + jobTitle.getTitle() +
                ", employer=" + employer.getName() +
                '}';
    }
}
