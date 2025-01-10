import java.util.Scanner;
// Create TemperatureConversion  to convert Celsius to Fahrenheit
public class TemperatureConversion {
    public static void main(String[] args) {
        // Declare a variable for temperature in Celsius
        double celsius;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        celsius = input.nextDouble();
        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        // Close the scanner object
        input.close();
    }
}

 