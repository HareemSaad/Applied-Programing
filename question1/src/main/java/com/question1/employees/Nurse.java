package com.question1.employees;

public class Nurse extends Employee {

    private int shiftHours;

    public Nurse(String name, Integer id, double salary, int shiftHours) {
        super(name, id, salary);
        this.shiftHours = shiftHours;
    }

    @Override
    public void work() {
        System.out.println("Nurse is taking care of patients.");
    }

    public int getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(int shiftHours) {
        this.shiftHours = shiftHours;
    }
}
