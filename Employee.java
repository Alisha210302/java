// Define an abstract class named Employee
public abstract class Employee {

    // Protected variables to store employee ID and name
    protected int empid;       // Employee ID
    protected String name;     // Employee name

    // Constructor to initialize empid and name
    public Employee(int empid, String name) {
        this.empid = empid;   // Set the employee ID
        this.name = name;     // Set the employee name
    }

    // Abstract method to calculate gross salary, to be implemented by subclasses
    public abstract double calculateGross();

    // Override the toString method to provide a string representation of the Employee
    @Override
    public String toString() {
        return "Employee Data : " + empid + " " + name; // Return employee details
    }
}
