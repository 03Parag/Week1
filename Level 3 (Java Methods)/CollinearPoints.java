import java.util.Scanner;
// Create CollinearPoints class to find the three points is collinear using the area of the triangle formula
public class CollinearPoints {
    // Method to check if the three points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Slope AB = (y2 - y1) / (x2 - x1)
        double slopeAB = (y2 - y1) / (x2 - x1);        
        // Slope BC = (y3 - y2) / (x3 - x2)
        double slopeBC = (y3 - y2) / (x3 - x2);        
        // Slope AC = (y3 - y1) / (x3 - x1)
        double slopeAC = (y3 - y1) / (x3 - x1);        
        // If the slopes are equal, the points are collinear
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }
    // Method to check if the three points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Area of the triangle formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is 0
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the three points
        System.out.print("Enter the coordinates of point A (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter the coordinates of point B (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Enter the coordinates of point C (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        // Check if the points are collinear using the slope method
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);       
        // Check if the points are collinear using the area method
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        // Output the results
        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
        scanner.close();
    }
}
