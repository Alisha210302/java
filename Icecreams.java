// Define a class Icecreams that extends the Dessert class
public class Icecreams extends Dessert {

    // Protected variables to store total price, quantity, and price per unit
    protected int total;      // Total price of the ice creams
    protected int piece;      // Number of pieces (currently unused)
    protected int quantity;    // Number of ice creams
    protected int price = 10;  // Price per ice cream (default price)

    // Constructor for the Icecreams class, initializes quantity
    public Icecreams(int quantity) {
        // this.piece = piece; // This line is commented out as piece is not used
        this.quantity = quantity; // Set the quantity of ice creams
    }

    // Method to calculate the total price of the ice creams
    public int calculatePrice() {
        this.total = this.quantity * this.price; // Calculate total price
        return this.total; // Return the total price
    }
}
