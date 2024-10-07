import java.util.HashSet; // Import the HashSet class
import java.util.Set; // Import the Set interface

// Define a public class named DemoSet
public class DemoSet {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create a HashSet to store Integer values
        Set<Integer> set = new HashSet<>();

        // Add elements to the set
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(12); // Adding a duplicate value (12)

        // Iterate over the set and print each element
        for (Integer i : set) {
            System.out.println(i); // Outputs: 12, 13, 14 (order may vary)
        }

        // Remove an element from the set
        set.remove(14); // Removes the value 14 from the set

        // Check if the set contains specific elements
        System.out.println(set.contains(13)); // Outputs: true
        System.out.println(set.contains(19)); // Outputs: false
    }
}
