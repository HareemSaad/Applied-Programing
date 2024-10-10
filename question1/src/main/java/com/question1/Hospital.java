package com.question1;

import com.question1.employees.Doctor;
import com.question1.employees.Employee;
import com.question1.employees.Nurse;
import com.question1.employees.Receptionist;
import com.question1.employees.Surgeon;

public class Hospital {
    public void manageEmployee(Employee emp) {
        emp.work();
    }

    //Implement a method in the `Hospital` class called `paySalary()` that takes an `Employee` object and prints the salary based on the type of employee (use polymorphism if required).
    public void paySalary(Employee emp) {
        System.out.println("Salary for " + emp.getName() + " is " + emp.getSalary());
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor("Dr. John Doe", 1, 100000, "Cardiologist");
        Nurse nurse = new Nurse("Nurse Jane Doe", 2, 50000, 8);
        Receptionist receptionist = new Receptionist("Receptionist John Smith", 3, 30000, 1);
        Surgeon surgeon = new Surgeon("Dr. Jane Smith", 4, 120000, "Neurosurgeon", 10);

        hospital.manageEmployee(doctor);
        hospital.paySalary(doctor);
        hospital.manageEmployee(nurse);
        hospital.paySalary(nurse);
        hospital.manageEmployee(receptionist);
        hospital.paySalary(receptionist);
        hospital.manageEmployee(surgeon);
        hospital.paySalary(surgeon);
    }
}