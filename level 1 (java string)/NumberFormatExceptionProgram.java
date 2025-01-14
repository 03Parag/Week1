import java.util.Scanner;
// Create NumberFormatExceptionProgram class to generate a exception and handle the  runtime exception 
public class NumberFormatExceptionProgram {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Try to parse an integer 
        System.out.println("Parsed number: " + Integer.parseInt(text));
    }
    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Try to parse an integer 
            System.out.println("Parsed number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("Found an NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Found a RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the text in string
        System.out.print("Enter a string: ");
        String text = input.next();
        System.out.println("Demonstrating NumberFormatException:");
        // Call the method for generating exception
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught an NumberFormatException: " + e.getMessage());
        }
        System.out.println("Handling NumberFormatException:");
        // Call the method for handling exception
        handleException(text);
        // Close the Scanner
        input.close();
    }
}
