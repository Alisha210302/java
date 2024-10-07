// Define a public class named Count_cases
public class Count_cases {

    // Method to count the number of upper case letters, lower case letters, digits, and special characters in a string
    public static void cases(String s) {
        // Convert the string to a character array
        char arr[] = s.toCharArray();

        // Initialize counters for different character types
        int upper = 0; // Counter for upper case letters
        int lower = 0; // Counter for lower case letters
        int spl = 0;   // Counter for special characters
        int digit = 0; // Counter for digits

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is an uppercase letter
            if (Character.isUpperCase(arr[i])) {
                upper++; // Increment the upper case counter
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(arr[i])) {
                lower++; // Increment the lower case counter
            }
            // Check if the character is a digit
            else if (Character.isDigit(arr[i])) {
                digit++; // Increment the digit counter
            }
            // If the character is none of the above, it is considered a special character
            else {
                spl++; // Increment the special character counter
            }
        }

        // Print the counts of each character type
        System.out.println("Upper : " + upper);
        System.out.println("Lower : " + lower);
        System.out.println(" Digit: " + digit);
        System.out.println("Special : " + spl);
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Test the cases method with different strings
        cases("Sid9#");    // Should count and display the character types in the string "Sid9#"
        cases("*****");    // Should count and display the character types in the string "*****"
    }
}
