import java.util.Scanner;
// Create a HeightConverter to calculate your height in feets and inches
public class HeightConverter {
    public static void main(String[] args) {
        // Declare the variable heightCm
        double heightCm;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        // Conversion rate
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        // Convert height to inches
        double totalInches = heightCm / cmPerInch;
        // Calculate feet and remaining inches
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;
        // Print the results
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet +  " and inches is " + inches);                          
        // Close the scanner object
        input.close();
    }
}
