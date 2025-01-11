import java.util.Scanner;
// Create MeanHeightCalculator class to find the mean height of players present in a football team
public class MeanHeightCalculator {
    public static void main(String[] args) {
        // Store heights of 11 players by using array
        double[] heights = new double[11];
        // Store the sum of heights and initialize it to 0.0
        double sum = 0.0;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter height values
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            // Add the height to the sum
            sum += heights[i];
        }
        // Calculate the mean height
        double mean = sum / heights.length;
        // Display the mean height
        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);
        // Close the Scanner
        input.close();
    }
}
