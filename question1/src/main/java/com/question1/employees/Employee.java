package com.question1.employees;

public class Employee {

    private String name;
    private Integer id;
    private double salary;

    public Employee(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
