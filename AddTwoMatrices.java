public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] arr1 = {{10, 20, 30}, {40, 50, 60}};
        int[][] arr2 = {{11, 22, 33}, {44, 55, 66}};

        // Assuming both matrices have the same dimensions
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        // Add the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}