import java.util.Scanner;
// Create UnitConverter_1 class to convert various units
public class UnitConverter_1 {
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        double feet = yards * yards2feet;
        // Return the value
        return feet;
    }
    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        // Return the value
        return yards;
    }
    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        // Return the value
        return inches;
    }
    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        // Return the value
        return meters;
    }
    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        // Return the value
        return cm;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter a value in yards
        System.out.print("Enter the value in yards: ");
        double yardsValue = input.nextDouble();
        // Call the method to convert yards to feet
        double feetValue = UnitConverter_1.convertYardsToFeet(yardsValue);
        // Display value in feet
        System.out.println("Distance in feet (from yards): " + feetValue);
        // Enter a value in feet
        System.out.print("Enter the value in feet: ");
        double feetInput = input.nextDouble();
        // Call the method to convert feet to yards
        double yardsOutput = UnitConverter_1.convertFeetToYards(feetInput);
        // Display value in yards
        System.out.println("Distance in yards: " + yardsOutput);
        // Enter a value in meters
        System.out.print("Enter the value in meters: ");
        double metersValue = input.nextDouble();
        // Call the method to convert meters to inches
        double inchesValue = UnitConverter_1.convertMetersToInches(metersValue);
        // Display value in inches
        System.out.println("Distance in inches: " + inchesValue);
        // Enter a value in inches
        System.out.print("Enter the value in inches: ");
        double inchesInput = input.nextDouble();
        // Call the method to convert inches to meters
        double metersOutput = UnitConverter_1.convertInchesToMeters(inchesInput);
        // Display value in meters
        System.out.println("Distance in meters (from inches): " + metersOutput);
        // Enter a value in inches
        System.out.print("Enter the value in inches: ");
        double inchesValues = input.nextDouble();
        // Call the method to convert inches to centimeters
        double cmValue = UnitConverter_1.convertInchesToCentimeters(inchesValues);
        // Display value in centimeters
        System.out.println("Distance in centimeters: " + cmValue);
        // Close the scanner
        input.close();
    }
}
