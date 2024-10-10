// Define a class ContractEmployee that extends the Employee class
public class ContractEmployee extends Employee {

    // Protected variables to hold remuneration and hours worked
    protected int remuneration; // Remuneration per hour
    protected int hrs;          // Number of hours worked

    // Constructor for ContractEmployee
    public ContractEmployee(int empid, String name, int remuneration, int hrs) {
        // Call the constructor of the superclass (Employee) to initialize empid and name
        super(empid, name);
        // Initialize remuneration and hours worked
        this.remuneration = remuneration;
        this.hrs = hrs;
    }

    // Override the calculateGross method from the Employee class
    @Override
    public double calculateGross() {
        // Calculate and return the gross pay based on remuneration and hours worked
        return remuneration * hrs;
    }
}
