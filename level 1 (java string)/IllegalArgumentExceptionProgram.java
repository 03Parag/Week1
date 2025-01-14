import java.util.Scanner;
// Create IllegalArgumentExceptionProgram class to generate a exception and handle the  runtime exception
public class IllegalArgumentExceptionProgram {
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Use a substring() with start index greater than the end index
        System.out.println("Substring: " + text.substring(5, 3));
    }
    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Use a substring() with start index greater than the end index
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Found an IllegalArgumentException: " + e.getMessage());
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
        System.out.println("Demonstrating IllegalArgumentException:");
        // Call the method for generating exception
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught a IllegalArgumentException: " + e.getMessage());
        }
        System.out.println("Handling IllegalArgumentException:");
        // Call the method for handling exception
        handleException(text);
        // Close the Scanner
        input.close();
    }
}
