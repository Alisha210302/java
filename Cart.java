// Define a public class named Cart
public class Cart {
    // Static variable to hold the total price of all desserts in the cart
    static int totalPrice = 0;

    // Method to add a dessert to the cart
    public void addToCart(Dessert d) {
        // Increase the total price by the price of the dessert
        totalPrice += d.calculatePrice();
    }
}
