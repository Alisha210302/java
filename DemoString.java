// Define a public class named DemoString
public class DemoString {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create two String objects using the String constructor
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // Print the concatenation of s1 and s2
        System.out.println(s1 + s2); // Output: HelloHello

        // Compare s1 and s2 for content equality
        System.out.println(s1.equals(s2)); // Output: true

        // Concatenate s1 and s2 using the concat method
        System.out.println(s1.concat(s2)); // Output: HelloHello

        // Print the hash codes of s1 and s2
        System.out.println(s1.hashCode()); // Hash code of s1
        System.out.println(s2.hashCode()); // Hash code of s2

        // Create two String literals
        String n1 = "java";
        String n2 = "java";

        // Check if n1 and n2 reference the same object
        System.out.println(n1 == n2); // Output: true

        // Print the concatenation of n1 and n2
        System.out.println(n1 + n2); // Output: javajava

        // Concatenate n1 and n2 using the concat method
        System.out.println(n1.concat(n2)); // Output: javajava

        // Print the result of concatenating n1 with a literal
        System.out.println(n1 + " Siddhi"); // Output: java Siddhi

        // Create a new string by concatenating n1 with " Siddhi"
        String m = n1 + " Siddhi";
        // Print the newly created string
        System.out.println(m); // Output: java Siddhi
    }
}
