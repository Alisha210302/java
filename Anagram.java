import java.util.*; // Import the java.util package for using Arrays

// Define a public class named Anagram
public class Anagram {

    // Method to check if two strings are anagrams
    public static boolean anagram(String s1, String s2) {

        // Check if the lengths of the two strings are different
        if (s1.length() != s2.length()) {
            return false; // If lengths differ, they cannot be anagrams
        } else {
            // Convert both strings to lowercase for case-insensitive comparison
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();

            // Convert the strings to character arrays
            char arr1[] = s1.toCharArray();
            char arr2[] = s2.toCharArray();

            // Sort both character arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Check if the sorted character arrays are equal
            if (Arrays.equals(arr1, arr2)) {
                return true; // They are anagrams
            }
        }

        return false; // Return false if no other condition is met
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Test the anagram method and print the result
        System.out.println(anagram("silent", "listen")); // Should print true
    }
}
