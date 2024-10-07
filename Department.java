public class Department {
    // Private member variables to store employee ID and department name
    private String empid;
    private String deptname;

    // Getter method for employee ID
    public String getEmpid() {
        return empid;
    }

    // Setter method for employee ID
    public void setEmpid(String empid) {
        this.empid = empid;
    }

    // Getter method for department name
    public String getDeptname() {
        return deptname;
    }

    // Setter method for department name
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    // Constructor that initializes the Department object with an employee ID and department name
    public Department(int empid, String deptname) {
        super(); // Calls the constructor of the superclass (Object class)
        this.empid = String.valueOf(empid); // Converts empid to String and assigns it to the member variable
        this.deptname = deptname; // Assigns the department name to the member variable
    }
}
