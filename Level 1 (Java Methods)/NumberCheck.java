import java.util.Scanner;
// Create NumberCheck class to check whether a number is positive, negative, or zero
public class NumberCheck {
    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
             // Positive number
            return 1;
        } else if (number < 0) {
            // Negative number
            return -1; 
        } else {
            // Zero
            return 0; 
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number by user
        System.out.print("Enter an integer: ");
        // Read the integer input
        int number = input.nextInt(); 
        // Check the number using the method
        int result = checkNumber(number);
        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        // Close the scanner
        input.close();
    }
}
