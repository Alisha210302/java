// Define a public class named DemoObjectMethods
public class DemoObjectMethods {

    // Constructor for DemoObjectMethods
    public DemoObjectMethods() {
        super(); // Calls the constructor of the superclass (Object)
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create two Car objects with the same attributes
        Car c1 = new Car("aa", "bb", 10000);
        Car c2 = new Car("aa", "bb", 10000);

        // Compare the two Car objects for equality
        System.out.println(c1.equals(c2)); // Should print true if equals method is correctly overridden

        // Print the hash codes of both Car objects
        System.out.println(c1.hashCode()); // Hash code of c1
        System.out.println(c2.hashCode()); // Hash code of c2
    }
}
