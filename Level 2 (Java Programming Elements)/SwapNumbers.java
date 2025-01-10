import java.util.Scanner;
// Create SwapNumbers class to swap two numbers
public class SwapNumbers {
    public static void main(String[] args) {
        // Declare variables for the two numbers
        double number1, number2;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        // Enter the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        // Swap the numbers
        double temp = number1;
        number1 = number2;
        number2 = temp;
        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        // Close the scanner object
        input.close();
    }
}

 