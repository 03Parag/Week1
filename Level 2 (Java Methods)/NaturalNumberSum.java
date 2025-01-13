import java.util.Scanner;
// Create NaturalNumberSum class to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2
public class NaturalNumberSum {
    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    // Method to find the sum of n natural numbers
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number
        System.out.print("Enter a natural number (positive integer): ");
        int number = input.nextInt();
        // Check if the input is a natural number
        if (number <= 0) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        // Calculate the sum using recursion
        int sumRecursion = sumUsingRecursion(number);
        // Calculate the sum using the formula
        int sumFormula = sumUsingFormula(number);
        // Display the results
        System.out.println("Sum of " + number + " natural numbers using recursion: " + sumRecursion);
        System.out.println("Sum of " + number + " natural numbers using formula: " + sumFormula);
        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("The results from both methods are equal. Computation is correct.");
        } else {
            System.out.println("The results from both methods are not equal. Something is wrong.");
        }
        // Close the scanner
        input.close();
    }
}
