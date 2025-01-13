import java.util.Scanner;
// Create Quadratic class to find the roots of the equation ax2+ bx + c
public class Quadratic {
    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;
        // Check if delta is positive, zero or negative 
        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta is negative)
            // Empty array for no real roots
            return new double[0];
        }
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the coefficients a, b, and c by user
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        // Check if a is zero (invalid for a quadratic equation)
        if (a == 0) {
            System.out.println("The value of a cannot be zero for a quadratic equation.");
        } else {
            // Call the method to find the roots
            double[] roots = findRoots(a, b, c);
            // Display the results
            if (roots.length == 0) {
                System.out.println("No real roots.");
            } else if (roots.length == 1) {
                System.out.println("One real root: " + roots[0]);
            } else {
                System.out.println("Two real roots: " + roots[0] + " and " + roots[1]);
            }
        }
        // Close the scanner
        input.close();
    }
}
