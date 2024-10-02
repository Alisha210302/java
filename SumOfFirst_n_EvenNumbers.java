public class SumOfFirst_n_EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4; // Number of even numbers to sum

        // Loop to calculate the sum of the first n even numbers
        for (int i = 0; i < n; i++) {
            sum += 2 * (i + 1); // 2 * (i + 1) gives us the ith even number
        }

        System.out.println("Sum of first " + n + " even numbers: " + sum);
    }
}
