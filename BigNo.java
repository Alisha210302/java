import java.util.*; // Import the java.util package for using Scanner

// Define a public class named BigNo
public class BigNo {

    // Method to check if the number is greater than 60000
    public static void check(int n) throws Exception {
        // If n is greater than 60000, throw an Exception
        if (n > 60000) {
            throw new Exception("Number is too greater");
        }
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        int n = sc.nextInt(); // Read an integer input from the user
        try {
            check(n); // Call the check method to validate the input
        } catch (Exception e) {
            // If an Exception is thrown, print the exception message
            System.out.println(e.getMessage());
        }
    }
}
