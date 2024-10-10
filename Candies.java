// Define a class Candies that extends the Dessert class
public class Candies extends Dessert {

    // Protected variables to store total price, quantity, and price per unit
    protected int total;       // Total price of the candies
    protected int kg;          // Weight in kilograms (currently unused)
    protected int quantity;     // Number of candies
    protected int price = 10;   // Price per unit (default price of each candy)

    // Constructor for the Candies class, initializes quantity
    public Candies(int quantity) {
        // this.kg = kg; // This line is commented out as kg is not used
        this.quantity = quantity; // Set the quantity of candies
    }

    // Method to calculate the total price of the candies
    public int calculatePrice() {
        this.total = this.quantity * this.price; // Calculate total price
        return this.total; // Return the total price
    }
}
