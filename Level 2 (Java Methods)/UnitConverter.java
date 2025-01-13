import java.util.Scanner;
// Create UnitConverter class to convert values like km, miles, meters, and feet
public class UnitConverter {
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        // Return the value
        return miles;
    }
    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        // Return the value
        return km;
    }
    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        // Return the value
        return feet;
    }
    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        // Return the value
        return meters;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter a value in km
        System.out.print("Enter the value in km: ");
        double kmValue = input.nextDouble();
        // Call the method to convert km to miles
        double milesValue = UnitConverter.convertKmToMiles(kmValue);
        // Display value in miles
        System.out.println("Distance in miles: " + milesValue);
        // Enter a value in miles
        System.out.print("Enter the value in miles: ");
        double milesInput = input.nextDouble();
        // Call the method to convert miles to km
        double kmOutput = UnitConverter.convertMilesToKm(milesInput);
        // Display value in km
        System.out.println("Distance in km: " + kmOutput);
        // Enter a value in meters
        System.out.print("Enter the value in meters: ");
        double metersValue = input.nextDouble();
        // Call the method to convert meters to feet
        double feetValue = UnitConverter.convertMetersToFeet(metersValue);
        // Display value in feet
        System.out.println("Distance in feet: " + feetValue);
        // Enter a value in feet
        System.out.print("Enter the value in feet: ");
        double feetInput = input.nextDouble();
        // Call the method to convert feet to meters
        double metersOutput = UnitConverter.convertFeetToMeters(feetInput);
        // Display value in meters
        System.out.println("Distance in meters: " + metersOutput);
        // Close the scanner
        input.close();
    }
}
