import java.util.Scanner;
// Create SumUntilZero class to calculate the sum of numbers until 0 is entered
public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Declare and initialize total variable to 0.0
        double total = 0.0;        
        // Create a variable to store the user input
        double number;        
        // Use a while loop to check if the user entered 0
        do {
            // Ask the user to enter a number
            System.out.print("Enter a number (enter 0 to stop): ");
            number = input.nextDouble();            
            // If the number is not 0, add it to the total
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Loop continues until the user enters 0        
        // After the loop ends, display the total value
        System.out.println("The total sum is: " + total);        
        // Close the scanner object
        input.close();
    }
}
