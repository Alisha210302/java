// Define a public class named DemoArray
public class DemoArray {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Initialize an array of integers with some values
        int arr[] = {10, 21, 30, 41, 50};

        // Enhanced for loop to iterate through each element in the array
        for (int i : arr) {
            // Check if the current element is even
            if (i % 2 == 0) {
                // Print "Even" if the number is even
                System.out.println("Even");
            } else {
                // Print "Odd" if the number is odd
                System.out.println("Odd");
            }
        }

        // Declare an array of NewDate objects with a size of 3
        NewDate[] dd = new NewDate[3];

        // Initialize each element of the NewDate array
        dd[0] = new NewDate();
        dd[1] = new NewDate();
        dd[2] = new NewDate();

        // Set the day of each NewDate object to 1
        for (NewDate d : dd) {
            d.setDay(1);  // Assuming setDay is a method in NewDate class
        }

        // Print the day of each NewDate object
        for (NewDate d : dd) {
            System.out.println(d.getDay());  // Assuming getDay is a method in NewDate class
        }
    }
}
