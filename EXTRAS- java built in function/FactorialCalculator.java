import java.util.Scanner;
// Create FactorialCalculator class to calculates the factorial of a number using a recursive function
public class FactorialCalculator {
    // Function to enter the number
    public static int getInput() {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        // Close the scanner 
        scanner.close(); 
        return number;
    }
    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            // Base case: factorial of 0 or 1 is 1
            return 1;  
        } else {
            // Recursive case
            return n * calculateFactorial(n - 1);  
        }
    }
    // Function to display the result
    public static void displayResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args) {
        // Enter the number
        int number = getInput();
        // Calculate factorial using recursion
        int factorial = calculateFactorial(number);
        // Display the result
        displayResult(number, factorial);
    }
}
