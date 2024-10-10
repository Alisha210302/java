// Define a class Cookies that extends the Dessert class
public class Cookies extends Dessert {

    // Protected variables to store total price, quantity, and price per unit
    protected int total;      // Total price of the cookies
    protected int dozen;      // Number of dozens (currently unused)
    protected int price = 10; // Price per cookie (default price)
    protected int quantity;    // Number of cookies

    // Constructor for the Cookies class, initializes quantity
    public Cookies(int quantity) {
        // this.dozen = dozen; // This line is commented out as dozen is not used
        this.quantity = quantity; // Set the quantity of cookies
    }

    // Method to calculate the total price of the cookies
    public int calculatePrice() {
        this.total = this.quantity * this.price; // Calculate total price
        return this.total; // Return the total price
    }
}
