import java.util.Scanner;
// Create TriangleRun to compute the number of rounds user needs to do to complete 5km run
public class TriangleRun {
    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        // Perimeter = sum of all sides
        return side1 + side2 + side3; 
    }
    // Method to calculate the number of round to complete 5 km
    public static double calculateRounds(double perimeter) {
        // 5 km in meters   
        double distanceToRun = 5000;
        // Rounds = distance to run / perimeter
        return distanceToRun / perimeter; 
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the sides of the triangle
        System.out.print("Enter the length of side 1 of the triangle (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side 3 of the triangle (in meters): ");
        double side3 = input.nextDouble();
        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);
        // Calculate the number of round to complete 5 km
        double rounds = calculateRounds(perimeter);
        // Display result
        System.out.println("The athlete must complete " + rounds + " rounds to complete 5 km.");
        // Close the scanner
        input.close();
    }
}
