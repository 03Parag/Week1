import java.util.Scanner;
// Create OddEvenNumbers class to print odd and even numbers between 1 and the user-entered number
public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Declare a variable to store the number
        int number;
        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
        // Check if the number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Use a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd and print accordingly
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }
        // Close the scanner object
        input.close();
    }
}
