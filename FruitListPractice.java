import java.util.ArrayList; // Import ArrayList for dynamic array storage
import java.util.Arrays; // Import Arrays for array manipulation
import java.util.List; // Import List interface for storing fruit lists
import java.util.stream.Stream; // Import Stream for working with streams

public class FruitListPractice {

    public static void main(String[] args) {
        // Array of fruit names
        String[] fruits = {"Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon"};

        // Convert the array to a List
        List<String> lst = Arrays.asList(fruits);

        // Create a stream from the list and convert each fruit to uppercase, then print
        Stream<String> stream = lst.stream();
        stream.map((s) -> s.toUpperCase()).forEach(System.out::println);
        System.out.println("______________________________________________________");

        // Create a new stream and convert each fruit to lowercase, then print
        Stream<String> stream1 = lst.stream();
        stream1.map((s) -> s.toLowerCase()).forEach(System.out::println);
        System.out.println("______________________________________________________");

        // Create a stream to filter fruits starting with an uppercase letter and print them
        Stream<String> stream3 = lst.stream();
        stream3.filter((str) -> Character.isUpperCase(str.charAt(0))).forEach(System.out::println);
        System.out.println("______________________________________________________");

        // Filter fruits whose first letter (in lowercase) has a character code less than 'n' and print them
        int val = 'n'; // Character code for 'n'
        Stream<String> stream4 = lst.stream();
        stream4.filter((str) -> (int) str.toLowerCase().charAt(0) < val).forEach(System.out::println);
        System.out.println("______________________________________________________");

        // Filter fruits whose first letter (in lowercase) has a character code greater than 'n' and print them
        int val1 = 'n'; // Character code for 'n'
        Stream<String> stream5 = lst.stream();
        stream5.filter((str) -> (int) str.toLowerCase().charAt(0) > val1).forEach(System.out::println);
        System.out.println("______________________________________________________");

        // Filter fruits with a name length of 6 characters or fewer and print them
        Stream<String> stream6 = lst.stream();
        stream6.filter((str) -> str.length() <= 6).forEach(System.out::println);
    }
}
