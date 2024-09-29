package com.question1.package1;

public class Person {
    // private name
    private final String name;
    // private age
    private final int age;

    // constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // display info method
    public void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
