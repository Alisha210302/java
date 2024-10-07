import java.util.*; // Import the java.util package for using Scanner and other utilities

// Define a public class named MyShop
public class MyShop {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Stock to manage the toys
        Stock stock = new Stock();

        // Add toys to the stock with various attributes
        stock.addToy(new Toy(1, "A", 25, 5, 1, 1, "Educational", 1));
        stock.addToy(new Toy(2, "B", 44, 8, 2, 2, "Battery Operated", 2));
        stock.addToy(new Toy(3, "C", 35, 3, 3, 3, "Battery Operated", 3));
        stock.addToy(new Toy(4, "D", 15, 6, 4, 4, "Educational", 4));

        // Start an infinite loop to display the menu and process user choices
        while (true) {
            // Display the toy store menu
            System.out.println("\nToy Store Menu:");
            System.out.println("1. List Stock");
            System.out.println("2. Filter by Category");
            System.out.println("3. Search Toy by ID");
            System.out.println("4. List Toys by Price Range");
            System.out.println("5. List Toys by Age");
            System.out.println("6. Sort Toys by Price");
            System.out.println("7. Sort Toys by Product ID");
            System.out.println("8. List Old Stock (older than 1 year)");
            System.out.println("9. Group Toys by Category");
            System.out.println("10. Exit");

            // Create a scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); // Read user choice

            // Switch statement to handle different menu options
            switch (choice) {
                case 1:
                    stock.liststock(); // List all toys in stock
                    break;
                case 2:
                    System.out.print("Enter category: "); // Prompt for category
                    String category = scanner.next(); // Read category
                    stock.filterByCategory(category); // Filter toys by the given category
                    break;
                case 3:
                    System.out.print("Enter toy product ID: "); // Prompt for toy ID
                    int productId = scanner.nextInt(); // Read toy ID
                    stock.searchToy(productId); // Search for toy by ID
                    break;
                case 4:
                    System.out.print("Enter minimum price: "); // Prompt for min price
                    double minPrice = scanner.nextDouble(); // Read min price
                    System.out.print("Enter maximum price: "); // Prompt for max price
                    double maxPrice = scanner.nextDouble(); // Read max price
                    stock.listToyByPriceRange(minPrice, maxPrice); // List toys in the price range
                    break;
                case 5:
                    System.out.print("Enter age group: "); // Prompt for age group
                    int age = scanner.nextInt(); // Read age group
                    stock.listToysByAge(age); // List toys suitable for the age group
                    break;
                // Add more cases here for sorting and other functionalities
                default:
                    System.out.println("Invalid choice, please try again."); // Handle invalid choice
            }
        }
    }
}
