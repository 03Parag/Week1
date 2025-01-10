import java.util.Scanner;
// Create RocketLaunch class to count down for a rocket launch
public class RocketLaunch {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Enter the countdown start value
        System.out.print("Enter the countdown value for the rocket launch: ");
        int counter = input.nextInt();        
        // While loop to count down to 1
        while (counter >= 1) {
            System.out.println(counter);  // Print the current countdown number
            counter--;  // Decrement the counter
        }        
        // Print launch message after countdown finishes
        System.out.println("Launch!");        
        // Close the scanner object
        input.close();
    }
}
