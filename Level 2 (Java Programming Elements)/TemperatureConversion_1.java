import java.util.Scanner;
// Create TemperatureConversion_1 class to convert Fahrenheit to Celsius
public class TemperatureConversion_1 {
    public static void main(String[] args) {
        // Declare a variable for temperature in Fahrenheit
        double fahrenheit;        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        // Close the scanner object
        input.close();
    }
}

 