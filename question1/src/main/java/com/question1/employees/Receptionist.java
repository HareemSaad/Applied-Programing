package com.question1.employees;

public class Receptionist extends Employee {

    private int deskNumber;

    public Receptionist(String name, Integer id, double salary, int deskNumber) {
        super(name, id, salary);
        this.deskNumber = deskNumber;
    }

    @Override
    public void work() {
        System.out.println("Receptionist is managing appointments.");
    }

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }
}