import java.util.Scanner;
// Create CheckNumber class to check if the number is positive, negative, or zero
public class CheckNumber{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Enter the number to be checked
        System.out.print("Enter a number: ");
        int number = input.nextInt();        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            // If the number is greater than 0, it's positive
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // If the number is less than 0, it's negative
            System.out.println("The number is negative.");
        } else {
            // If the number is 0
            System.out.println("The number is zero.");
        }        
        // Close the scanner object
        input.close();
    }
}
