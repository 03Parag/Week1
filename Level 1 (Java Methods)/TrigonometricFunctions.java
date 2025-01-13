import java.util.Scanner;
// Create TrigonometricFunctions class to find sine, cosine and tangent
public class TrigonometricFunctions {
    // Method to calculate sine, cosine, and tangent 
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        // Return results 
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();
        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        // Display the results
        System.out.println("For the angle " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        // Close the scanner
        input.close();
    }
}
