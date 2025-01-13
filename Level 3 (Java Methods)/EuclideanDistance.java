import java.util.Scanner;
// Create EuclideanDistance class to find the distance between two points
public class EuclideanDistance {
    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using Math.pow() and Math.sqrt() to calculate the Euclidean distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // To store the slope (m) and y-intercept (b)
        // Check if the points are the same (to avoid division by zero in slope calculation)
        if (x1 == x2) {
            System.out.println("The points form a vertical line (undefined slope).");
            return equation; // Returning an empty array since the line is vertical
        }
        // Slope formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        // y-intercept formula: b = y1 - m * x1
        double b = y1 - m * x1;
        equation[0] = m; // Slope
        equation[1] = b; // Y-intercept
        return equation;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the points
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        // Calculate the equation of the line
        double[] equation = findLineEquation(x1, y1, x2, y2);
        if (equation.length > 0) {
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        }
        scanner.close();
    }
}
