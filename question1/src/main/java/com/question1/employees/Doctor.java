package com.question1.employees;

public class Doctor extends Employee {

    private String specialization;

    public Doctor(String name, Integer id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Doctor is treating patients.");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
