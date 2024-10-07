import java.util.Set; // Import Set to hold the skills of the employee

public class Employee {
    // Private member variables for employee details
    private int empid; // Employee ID
    private String name; // Employee name
    private double salary; // Employee salary
    private Set<String> skillset; // Set of employee skills
    private String department; // Department name

    // Constructor to initialize the Employee object
    public Employee(int i, String name, int i1, Set<String> skills, String it) {
        this.empid = i; // Initialize empid
        this.name = name; // Initialize name
        this.salary = i1; // Initialize salary
        this.skillset = skills; // Initialize skillset
        this.department = it; // Initialize department
    }

    // Getter method for employee ID
    public int getEmpid() {
        return empid;
    }

    // Setter method for employee ID
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Setter method for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for employee salary
    public double getSalary() {
        return salary;
    }

    // Setter method for employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter method for skillset
    public Set<String> getSkillset() {
        return skillset;
    }

    // Setter method for skillset
    public void setSkillset(Set<String> skillset) {
        this.skillset = skillset;
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }

    // Setter method for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Override the toString method to provide a string representation of the Employee object
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skillset=" + skillset
                + ", department=" + department + "]";
    }
}
