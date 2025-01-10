import java.util.Scanner;
// Create QuotientRemainder class to find quotient and remainder
public class QuotientRemainder {
    public static void main(String[] args) {
        // Declare the variable number1 and number2
        int number1 , number2;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the two numbers 
        System.out.print("Enter the first number (dividend): ");
        number1 = input.nextInt();
        System.out.print("Enter the second number (divisor): ");
        number2 = input.nextInt();
        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        // Print the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        // Close the scanner object
        input.close();                          
    }
}
