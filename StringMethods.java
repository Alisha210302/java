// Define a public class named StringMethods
public class StringMethods {

    // Method to convert a string to lowercase
    public static String convertToLower(String s) throws EmptyStringException {
        // Check if the string is empty
        if (s.equals("")) { // Use .equals() for string comparison
            throw new EmptyStringException("String is empty"); // Throw an exception if empty
        } else {
            return s.toLowerCase(); // Convert and return the string in lowercase
        }
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        String s1 = ""; // Initialize an empty string
        try {
            // Attempt to convert the string to lowercase
            String lower = convertToLower(s1);
            System.out.println(lower); // Print the lowercase string
        } catch (EmptyStringException e) {
            // Catch the custom exception and print the message
            System.out.println(e.getMessage());
        }
    }
}
