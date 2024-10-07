// Define a public class named Math
public class Math {

    // Static method to increment a given number by 1
    public static int increment(int num) {
        num++; // Increase the value of num by 1
        return num; // Return the incremented value
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Initialize an integer variable n with a value of 0
        int n = 0;
        System.out.println("Before: " + n); // Print the value of n before incrementing

        // Increment n using the increment method and update its value
        n = increment(n);
        System.out.println("After: " + n); // Print the value of n after the first increment

        // Increment n again and update its value
        n = increment(n);
        System.out.println("After: " + n); // Print the value of n after the second increment
    }
}
