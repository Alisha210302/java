import java.util.*; // Import the java.util package for using Scanner

// Define a class Store that extends the Cart class
public class Store extends Cart {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        int count = 0; // Initialize a counter for total items
        System.out.println("Welcome to the Store ");
        System.out.println("****************************************");

        // Infinite loop to keep the store running
        while (true) {
            // Prompt user for type of dessert
            System.out.println("Enter Type of Dessert: ");
            String type = sc.next(); // Read the type of dessert
            System.out.println("Enter total items: ");
            int quantity = sc.nextInt(); // Read the quantity of desserts
            count += quantity; // Update the total item count

            // Switch case to handle different types of desserts
            switch (type) {
                case "Cookies":
                    // Create a Cookies object with the specified quantity
                    Cookies cook = new Cookies(quantity);
                    Cart cook1 = new Cart(); // Create a new Cart object
                    cook1.addToCart(cook); // Add cookies to the cart
                    System.out.println("Total price of " + type + ": " + cook.calculatePrice()); // Print total price of cookies
                    break;

                case "Candies":
                    // Create a Candies object with the specified quantity
                    Candies can = new Candies(quantity);
                    Cart can1 = new Cart(); // Create a new Cart object
                    can1.addToCart(can); // Add candies to the cart
                    System.out.println("Total price of " + type + ": " + can.calculatePrice()); // Print total price of candies
                    break;

                case "Icecreams":
                    // Create an Icecreams object with the specified quantity
                    Icecreams ice = new Icecreams(quantity);
                    Cart ice1 = new Cart(); // Create a new Cart object
                    ice1.addToCart(ice); // Add ice creams to the cart
                    System.out.println("Total price of " + type + ": " + ice.calculatePrice()); // Print total price of ice creams
                    break;

                default:
                    System.out.println("Invalid dessert type. Please try again."); // Handle invalid input
                    continue; // Skip to the next iteration of the loop
            }

            // Display total items in the cart and the total bill
            System.out.println("Total items in Cart: " + count);
            System.out.println("Total Bill: " + totalPrice);
            System.out.println("_______________________________");
        }
    }
}
