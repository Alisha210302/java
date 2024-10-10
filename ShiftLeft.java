// Define a public class named ShiftLeft
public class ShiftLeft {

    // Method to perform a left shift on the characters of a string
    public static void leftShift(String s) {
        // Convert the input string to a character array
        char arr[] = s.toCharArray();
        // Create a new character array to store the shifted characters
        char newarr[] = new char[s.length()];

        // Loop through each character in the original string
        for (int i = 0; i < s.length(); i++) {
            // If the index is in the first half of the string
            if (i < (s.length() - 1) / 2) {
                // Shift the character to the right by 4 positions
                newarr[i + 2 * 2] = arr[i]; // 2 * 2 is effectively shifting by 4
            } else {
                // For the second half, shift the character to the left by 2 positions
                newarr[i - 2] = arr[i];
            }
        }

        // Print the characters in the new array to show the result
        for (int i = 0; i < s.length(); i++) {
            System.out.print(newarr[i]);
        }
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Call the leftShift method with the string "siddhi"
        leftShift("siddhi");
    }
}
