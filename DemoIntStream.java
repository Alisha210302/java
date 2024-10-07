import java.util.Arrays; // Import the Arrays class for array manipulation
import java.util.List; // Import the List interface
import java.util.OptionalDouble; // Import OptionalDouble to handle double values
import java.util.OptionalInt; // Import OptionalInt to handle int values
import java.util.stream.Collectors; // Import Collectors for stream collection
import java.util.stream.IntStream; // Import IntStream for working with int streams

public class DemoIntStream {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        // Create an IntStream from the array
        IntStream stream = Arrays.stream(nums);

        // Count the total number of elements in the stream
        System.out.println(stream.count());

        // Reinitialize the stream and count distinct elements, sort them, then count again
        stream = Arrays.stream(nums);
        System.out.println(stream.distinct().sorted().count());

        // Reinitialize the stream and print distinct sorted elements
        stream = Arrays.stream(nums);
        // Commented out line has a typo ("discount" should be "distinct")
        // stream.discount().sorted.forEach((n) -> System.out.println(n));

        // Print each distinct and sorted number
        stream.distinct().sorted().forEach(System.out::println);

        // Reinitialize the stream and calculate the squares of each number
        stream = Arrays.stream(nums);
        List<Integer> squares = stream.map((n) -> n * n) // Map each number to its square
                .boxed() // Box each int to Integer
                .collect(Collectors.toList()); // Collect results into a List
        System.out.println(squares); // Print the list of squares

        // Reinitialize the stream and filter for even numbers
        stream = Arrays.stream(nums);
        List<Integer> even = stream.filter((n) -> n % 2 == 0) // Filter even numbers
                .boxed() // Box each int to Integer
                .collect(Collectors.toList()); // Collect results into a List
        System.out.println(even); // Print the list of even numbers

        // Reinitialize the stream to find the minimum value
        stream = Arrays.stream(nums);
        OptionalInt min = stream.min(); // Find the minimum value
        if (min.isPresent()) { // Check if a minimum value exists
            System.out.println(min.getAsInt()); // Print the minimum value
        }

        // Reinitialize the stream to find the maximum value
        stream = Arrays.stream(nums);
        OptionalInt max = stream.max(); // Find the maximum value
        if (max.isPresent()) { // Check if a maximum value exists
            System.out.println(max.getAsInt()); // Print the maximum value
        }

        // Reinitialize the stream to calculate the average value
        stream = Arrays.stream(nums);
        OptionalDouble ave = stream.average(); // Calculate the average
        if (ave.isPresent()) { // Check if the average exists
            System.out.println(ave.getAsDouble()); // Print the average value
        }

        // Reinitialize the stream to calculate the product of all numbers
        stream = Arrays.stream(nums);
        OptionalInt total = stream.reduce((n1, n2) -> n1 * n2); // Reduce to the product of all numbers
        if (total.isPresent()) { // Check if the product exists
            System.out.println(total.getAsInt()); // Print the product
        }

        // Reinitialize the stream to calculate the total value using identity
        stream = Arrays.stream(nums);
        long totalval = stream.reduce(1, (n1, n2) -> n1 * n2); // Reduce to product, starting from 1
        // The following line incorrectly checks 'total.isPresent()' which is not valid here
        System.out.println(totalval); // Print the total value
    }
}
