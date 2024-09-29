package com.question1.package2;

public class Company {
    // static variable
    public static String companyName = "Systems Limited";
    // employee count
    private int employeeCount = 0;

    // constructor
    public Company() {
        employeeCount = 0;
    }

    // parameterized constructor
    public Company(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    // display method
    public void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Count: " + employeeCount);
    }
}
