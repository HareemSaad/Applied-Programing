package com.question1.package2;

import com.question1.package1.Designation;
import com.question1.package1.Employee;
import com.question1.package1.Person;

public class Main {
    public static void main(String[] args) {
        // Create a Person object using both the default and parameterized constructors and display their information.
        Person person1 = new Person();
        person1.displayInfo();
        Person person2 = new Person("Ali", 25);
        person2.displayInfo();

        System.out.println();

        // Create an Employee object using both the default and parameterized constructors and display their information.
        Employee employee1 = new Employee();
        employee1.displayInfo();
        Employee employee2 = new Employee("Ahmed", 30, Designation.DEVELOPER);
        employee2.displayInfo();

        System.out.println();

        // Print the company name using the static variable from Company.
        System.out.println("Company Name: " + Company.companyName);

        System.out.println();

        // Create a Company object and display its information.
        Company company = new Company(100);
        company.displayCompanyInfo();

    }
}
