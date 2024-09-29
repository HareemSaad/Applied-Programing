package com.question1.package1;
public class Employee {
    // instance variables
    private final String name;
    private final int age;
    private final Designation designation;

    // constructors
    public Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.designation = Designation.ASSIGNED;
    }

    public Employee(String name, int age, Designation designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // display info method
    public void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Designation: " + designation);
    }
}
