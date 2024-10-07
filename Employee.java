import java.util.Set; // Import the Set interface for skillset

// Define a public class named Employee
public class Employee {
    private int empid; // Employee ID
    private String name; // Employee name
    private double salary; // Employee salary
    private Set<String> skillset; // Set of skills associated with the employee

    // Constructor to initialize Employee attributes
    public Employee(int empid, String name, double salary, Set<String> skillset) {
        super(); // Call to the superclass constructor (not necessary here)
        this.empid = empid; // Initialize empid
        this.name = name; // Initialize name
        this.salary = salary; // Initialize salary
        this.skillset = skillset; // Initialize skillset
    }

    // Getter for empid
    public int getEmpid() {
        return empid;
    }

    // Setter for empid
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for skillset
    public Set<String> getSkillset() {
        return skillset;
    }

    // Setter for skillset
    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    // Override the toString method to provide a string representation of the Employee object
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skillset=" + skillset + "]";
    }
}
