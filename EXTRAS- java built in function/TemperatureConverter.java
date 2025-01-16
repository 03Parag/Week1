import java.util.Scanner;
// Create TemperatureConverter class to convert temperatures between Fahrenheit and Celsius and vice versa
public class TemperatureConverter {
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args) { // Corrected parenthesis here
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = input.nextInt();
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
        input.close(); // Close the scanner
    }
}
