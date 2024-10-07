import java.util.HashMap; // Import the HashMap class
import java.util.Map; // Import the Map interface
import java.util.Set; // Import the Set interface

// Define a public class named DemoMap
public class DemoMap {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieve and print the value associated with the key "two"
        System.out.println(map.get("two")); // Outputs: 2

        // Get the set of keys from the map
        Set<String> keys = map.keySet();

        // Iterate through the keys and print each key with its corresponding value
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key)); // Outputs: key -> value pairs
        }
    }
}
