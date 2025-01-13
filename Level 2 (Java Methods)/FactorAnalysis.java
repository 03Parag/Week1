import java.util.Scanner;
// Create FactorAnalysis class to  find the sum, sum of square of factors and product of the factors 
public class FactorAnalysis {
    // Method to find the factors of a number
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // Initialize the array 
        int[] factors = new int[count];
        int index = 0;
        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method to find the sum of squares of the factors
    public static int findSumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Find the factors of the number
        int[] factors = findFactors(number);
        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        // Calculate the sum, product, and sum of squares of the factors
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        int sumOfSquares = findSumOfSquaresOfFactors(factors);
        System.out.println("Sum of the factors: " + sum);
        System.out.println("Product of the factors: " + product);
        System.out.println("Sum of the squares of the factors: " + sumOfSquares);
        // Close the scanner
        input.close();
    }
}
