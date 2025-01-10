import java.util.Scanner;
// Create Factorial_1 class to compute the factorial of an integer using a for loop
public class Factorial_1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Declare a variable to store the number
        int number;        
        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();        
        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize a variable to store the factorial result (start with 1)
            long factorial = 1;            
            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i at each iteration
            }            
            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }        
        // Close the scanner object
        input.close();
    }
}
