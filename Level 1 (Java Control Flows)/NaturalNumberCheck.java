import java.util.Scanner;
// Create NaturalNumberCheck class to check if the number is natural and sum of n natural numbers
public class NaturalNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the number to be checked
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check if the number is a positive integer (natural number)
        if (number >= 1) {
            // Calculate the sum of the first n natural numbers using the formula
            int sum = (number * (number + 1)) / 2;
            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number, print this message
            System.out.println("The number " + number + " is not a natural number");
        }
        // Close the scanner object
        input.close();
    }
}
