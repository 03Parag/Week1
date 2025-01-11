import java.util.Scanner;
// Create MultiplicationTableRange class to find the multiplication table of a number from 6 to 9   
public class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input a number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = input.nextInt();
        // Store the multiplication results for numbers 6 to 9 in an array
        int[] multiplicationResult = new int[4];
        // Calculate the multiplication table and store the results in the array by using a loop
        for (int i = 6; i <= 9; i++) {
            // Store result in array
            multiplicationResult[i - 6] = number * i; 
        }
        // Display the results
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        // Close the Scanner
        input.close();
    }
}
