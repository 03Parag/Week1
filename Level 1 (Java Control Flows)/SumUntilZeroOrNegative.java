import java.util.Scanner;
// Create SumUntilZeroOrNegative class to calculate the sum until user enters 0 or negative number
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Declare and initialize total variable to 0.0
        double total = 0.0;        
        // Create a variable to store the user input
        double number;        
        // Use an infinite while loop
        while (true) {
            // Ask the user to enter a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            number = input.nextDouble();            
            // Check if the entered number is 0 or negative
            if (number <= 0) {
            // Exit the loop if 0 or negative number is entered
                break; 
            }            
            // Add the number to the total if it's positive
            total += number;
        }        
        // After the loop ends, display the total sum
        System.out.println("The total sum is: " + total);        
        // Close the scanner object
        input.close();
    }
}
