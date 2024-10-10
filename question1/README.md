# Hospital Management System

You have been hired as a software developer to design a simplified Hospital Management System. The system should manage various types of employees within a hospital, each with distinct roles and responsibilities. The system should allow the hospital administration to manage these employees efficiently by utilizing the concepts of inheritance and polymorphism.

## Base Class:
**Employee**: Each employee in the hospital shares common attributes and behaviors. Create a base class `Employee` that contains the following:
- `name`: String
- `id`: Integer
- `salary`: double
- `work()`: a method that prints a generic message like "Employee is working."

## Derived Classes:
- **Doctor**: Inherits from `Employee`. This class should have an additional attribute `specialization` (String). The `work()` method should be overridden to print "Doctor is treating patients."
- **Nurse**: Inherits from `Employee`. This class should have an additional attribute `shiftHours` (int). Override the `work()` method to print "Nurse is taking care of patients."
- **Receptionist**: Inherits from `Employee`. This class should have an additional attribute `deskNumber` (int). Override the `work()` method to print "Receptionist is managing appointments."
- **Surgeon**: Inherits from `Doctor`. This class should have an additional attribute `surgeryCount` (int). Override the `work()` method to print "Surgeon is performing surgery."

## Polymorphism:
Create a method `manageEmployee(Employee emp)` in a separate `Hospital` class. This method should take an `Employee` object and call the `work()` method. Demonstrate how different employee types can be managed using polymorphism (i.e., how the method works differently based on whether the `Employee` is a `Doctor`, `Nurse`, `Receptionist`, or `Surgeon`).

Write a `main` method that creates a list of different types of employees, calls the `manageEmployee()` method for each, and demonstrates polymorphism in action.

## Additional Task:
Implement a method in the `Hospital` class called `paySalary()` that takes an `Employee` object and prints the salary based on the type of employee (use polymorphism if required).

### Expected Output:
Doctor is treating patients. The salary of Doctor [name] is [salary] PKR.
Nurse is taking care of patients. The salary of Nurse [name] is [salary] PKR.
Receptionist is managing appointments. The salary of Receptionist [name] is [salary] PKR.
Surgeon is performing surgery. The salary of Surgeon [name] is [salary] PKR.