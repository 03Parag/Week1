import java.util.Scanner;
// Create SumOfNaturalNumbers class to find the sum of n natural numbers
public class SumOfNaturalNumbers {
    // Method to find the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // Add each number to the sum
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number
        System.out.print("Enter a positive integer n : ");
        int n = input.nextInt();
        // Check the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            // Calculate the sum of n natural numbers
            int sum = calculateSum(n);
            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        // Close the scanner
        input.close();
    }
}
