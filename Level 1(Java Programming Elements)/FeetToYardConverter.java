import java.util.Scanner;
// Create FeetToYardConverter to convert feet into yard and mile
public class FeetToYardConverter {
    public static void main(String[] args) {
        // Declare the variable distanceInFeet
        double distanceInFeet;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();
        // Conversion rates
        double feetPerYard = 3;
        double yardsPerMile = 1760;
        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;
        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;
        // Display results
        System.out.println("The distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and in miles is " + distanceInMiles);                         
        // Close the scanner object
        input.close();
    }
}
