import java.util.Scanner;
// Create WindChillCalculator class to calculate the wind chill temperature
public class WindChillCalculator {
    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit : ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour : ");
        double windSpeed = input.nextDouble();
        // Calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);
        // Display the result
        System.out.println("The wind chill temperature is: " + windChill);
        // Close the scanner
        input.close();
    }
}
