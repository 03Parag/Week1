import java.util.Scanner;
// Create UnitConverter_2 class to convert various units
public class UnitConverter_2 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;                
        // Return the value
        return fahrenheit2celsius;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        // Return the value
        return celsius2fahrenheit;
    }
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        double kilograms = pounds * pounds2kilograms;
        // Return the value
        return kilograms;
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        double pounds = kilograms * kilograms2pounds;
        // Return the value
        return pounds;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;
        // Return the value
        return liters;
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        double gallons = liters * liters2gallons;
        // Return the value
        return gallons;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter a value in Fahrenheit
        System.out.print("Enter the value in Fahrenheit: ");
        double fahrenheitValue = input.nextDouble();
        // Call the method to convert Fahrenheit to Celsius
        double celsiusValue = UnitConverter_2.convertFahrenheitToCelsius(fahrenheitValue);
        // Display value in Celsius
        System.out.println("Temperature in Celsius: " + celsiusValue);
        // Enter a value in Celsius
        System.out.print("Enter the value in Celsius: ");
        double celsiusInput = input.nextDouble();
        // Call the method to convert Celsius to Fahrenheit
        double fahrenheitOutput = UnitConverter_2.convertCelsiusToFahrenheit(celsiusInput);
        // Display value in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);
        // Enter a value in pounds
        System.out.print("Enter the value in pounds: ");
        double poundsValue = input.nextDouble();
        // Call the method to convert pounds to kilograms
        double kilogramsValue = UnitConverter_2.convertPoundsToKilograms(poundsValue);
        // Display value in kilograms
        System.out.println("Weight in kilograms: " + kilogramsValue);
        // Enter a value in kilograms
        System.out.print("Enter the value in kilograms: ");
        double kilogramsInput = input.nextDouble();
        // Call the method to convert kilograms to pounds
        double poundsOutput = UnitConverter_2.convertKilogramsToPounds(kilogramsInput);
        // Display value in pounds
        System.out.println("Weight in pounds: " + poundsOutput);
        // Enter a value in gallons
        System.out.print("Enter the value in gallons: ");
        double gallonsValue = input.nextDouble();
        // Call the method to convert gallons to liters
        double litersValue = UnitConverter_2.convertGallonsToLiters(gallonsValue);
        // Display value in liters
        System.out.println("Volume in liters: " + litersValue);
        // Enter a value in liters
        System.out.print("Enter the value in liters: ");
        double litersInput = input.nextDouble();
        // Call the method to convert liters to gallons
        double gallonsOutput = UnitConverter_2.convertLitersToGallons(litersInput);
        // Display value in gallons
        System.out.println("Volume in gallons: " + gallonsOutput);
        // Close the scanner
        input.close();
    }
}
