// Define the Car class
public class Car {

    // Private instance variables to hold the make, model, and production date of the car
    private String make;
    private String model;
    private Date pdate; // pdate presumably stands for 'production date'

    // Constructor to initialize the Car object with make, model, and production date
    public Car(String make, String model, Date pdate) {
        this.make = make;    // Assign the provided make to the instance variable
        this.model = model;  // Assign the provided model to the instance variable
        this.pdate = pdate;  // Assign the provided production date to the instance variable
    }

    // Override the toString method to provide a string representation of the Car object
    public String toString() {
        // Return a formatted string showing the car's make, model, and production date
        return "make :" + make + " model :" + model + " pdate : " + pdate;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a new Car object with make "honda", model "city", and a production date of 1st January 2022
        Car c = new Car("honda", "city", new Date(1, "JAN", 2022));
        // Print the string representation of the Car object to the console
        System.out.println(c);
    }
}
