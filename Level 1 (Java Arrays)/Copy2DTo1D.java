import java.util.Scanner;
// Create Copy2DTo1D class to make a 2D Array and Copy it into a 1D array
public class Copy2DTo1D {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input the number of rows and columns from user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        // Create a 2D array (matrix) with the given rows and columns
        int[][] matrix = new int[rows][columns];
        // Enter the number to fill the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        // Create a 1D array of size rows * columns
        int[] array = new int[rows * columns];
        // Initialize index for the 1D array
        int index = 0;
        // Copy elements from the 2D array to the 1D array using nested for loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }
        // Display the 1D array
        System.out.println("\nThe elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // Close the scanner
        input.close();
    }
}
