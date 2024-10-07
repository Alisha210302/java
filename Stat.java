// Define a generic class Stat that restricts type T to subclasses of Number
public class Stat<T extends Number> {
    // Array to hold the numbers of type T
    T[] num;

    // Method to set values of the num array
    public void setValues(T[] num) {
        this.num = num; // Assign the provided array to the class field
    }

    // Method to calculate and return the average of the numbers
    public double getAverage() {
        double sum = 0.0; // Variable to hold the sum of the numbers
        // Loop through the num array to calculate the sum
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue(); // Convert each number to double and add to sum
        }

        // Return the average by dividing the sum by the number of elements
        return sum / num.length;
    }

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        // Create an instance of Stat for Integer type
        Stat<Integer> stat1 = new Stat<>();
        stat1.setValues(arr); // Set the Integer array values
        System.out.println(stat1.getAverage()); // Print the average

        // Create a Double array
        Double[] arr1 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        // Create an instance of Stat for Double type
        Stat<Double> stat2 = new Stat<>();
        stat2.setValues(arr1); // Set the Double array values
        System.out.println(stat2.getAverage()); // Print the average
    }
}
