import java.util.Scanner;
// Create TriangleAreaCalculator class to calculate the area in square cm and square inch
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Declare the variable for base and height
        double base, height; 
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        height = input.nextDouble();
        // Calculate the area in square inches
        double areaInInches = 0.5 * base * height;
        // Convert the area to square cm (1 inch = 2.54 cm)
        double areaInCm = areaInInches * Math.pow(2.54, 2);
        // Print the results
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");                           
        // Close the scanner object
        input.close();
    }
}
