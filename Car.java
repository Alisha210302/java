// Define a public class named Car
public class Car {

    // Private variables to store car's make, model, and price
    private String make;   // Brand of the car
    private String model;  // Model of the car
    private int price;     // Price of the car

    // Constructor to initialize the Car object with make, model, and price
    public Car(String make, String model, int price) {
        super();           // Calls the constructor of the superclass (Object)
        this.make = make;  // Set the make of the car
        this.model = model; // Set the model of the car
        this.price = price; // Set the price of the car
    }

    // Override the equals method to compare two Car objects
    @Override
    public boolean equals(Object other) {
        // Cast the other object to a Car type
        Car o = (Car) other;

        // Check if make, model, and price are the same for both cars
        if ((this.make.equals(o.make)) && (this.model.equals(o.model)) && (this.price == o.price)) {
            return true; // Return true if they are equal
        } else {
            return false; // Return false if they are not equal
        }
    }
}
