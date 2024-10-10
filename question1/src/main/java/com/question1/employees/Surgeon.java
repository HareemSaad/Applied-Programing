package com.question1.employees;

public class Surgeon extends Doctor {

    private int surgeryCount;

    public Surgeon(String name, Integer id, double salary, String specialization, int surgeryCount) {
        super(name, id, salary, specialization);
        this.surgeryCount = surgeryCount;
    }

    @Override
    public void work() {
        System.out.println("Surgeon is performing surgery.");
    }

    public int getSurgeryCount() {
        return surgeryCount;
    }

    public void setSurgeryCount(int surgeryCount) {
        this.surgeryCount = surgeryCount;
    }
}