import java.util.*; // Import the java.util package for using Scanner

// Define a public class named Store
public class Store {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a flavour choice
        System.out.print("Enter a flavour (CHOCOLATE, MINT, CREAM): ");
        String choice = sc.next(); // Read the user's input

        // Convert the input to uppercase and get the corresponding Flavour enum constant
        Flavour flavour = Flavour.valueOf(choice.toUpperCase());

        // Switch statement to handle the selected flavour
        switch (flavour) {
            case CHOCOLATE:
                System.out.println("Selected " + flavour); // Print the selected flavour
                break;

            case MINT:
                System.out.println("Selected " + flavour); // Print the selected flavour
                break;

            case CREAM:
                System.out.println("Selected " + flavour); // Print the selected flavour
                break;

            default:
                System.out.println("Invalid flavour selected."); // Handle invalid input (if needed)
                break;
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
