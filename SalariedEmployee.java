// Define a class SalariedEmployee that extends the Employee class
public class SalariedEmployee extends Employee {

    // Protected variable to store the basic salary
    protected double basic; // Basic salary of the employee

    // Constructor for SalariedEmployee
    public SalariedEmployee(int empid, String name, double basic) {
        super(empid, name); // Call the constructor of the superclass (Employee)
        this.basic = basic; // Initialize the basic salary
    }

    // Override the calculateGross method from the Employee class
    @Override
    public double calculateGross() {
        // Calculate House Rent Allowance (HRA) as 40% of basic salary
        double hra = basic * 0.4;
        // Calculate Dearness Allowance (DA) as 12% of basic salary
        double da = basic * 0.12;
        // Return the total gross salary (basic + HRA + DA)
        return basic + hra + da;
    }

    // Method to calculate net salary after tax
    public double calulateNet() {
        double gross = this.calculateGross(); // Calculate gross salary
        double tax = gross * 0.2; // Calculate tax as 20% of gross salary
        // Return net salary after deducting tax from gross salary
        return gross - tax;
    }
}
