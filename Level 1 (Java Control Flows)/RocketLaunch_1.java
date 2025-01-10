import java.util.Scanner;
// Create RocketLaunch_1 class to count down for a rocket launch using a for-loop
public class RocketLaunch_1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Enter the countdown start value
        System.out.print("Enter the countdown value for the rocket launch: ");
        int counter = input.nextInt();        
        // For-loop to count down from the entered value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);  // Print the current countdown number
        }        
        // Print launch message after countdown finishes
        System.out.println("Launch!");        
        // Close the scanner object
        input.close();
    }
}
