import java.util.Scanner;
// Create SquareSideCalculator class to calculate the side of the square 
public class SquareSideCalculator {
    public static void main(String[] args) {
        // Declare a perimeter variable 
        double perimeter;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();
        // Calculate the side length
        double side = perimeter / 4;
        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);                           
        // Close the scanner object
        input.close();
    }
}
