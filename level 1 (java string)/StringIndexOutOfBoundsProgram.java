import java.util.Scanner;
// Create StringIndexOutOfBoundsProgram class to generate a exception and handle the  runtime exception
public class StringIndexOutOfBoundsProgram {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Access an index beyond the string's length
        System.out.println("Character at index 50: " + text.charAt(50));
    }
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // try to access an index beyond the string's length
            System.out.println("Character at index 50: " + text.charAt(50));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Found a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the text in string
        System.out.print("Enter a string: ");
        String text = input.next();
        System.out.println("Demonstrating StringIndexOutOfBoundsException:");
        // Call the method for generating exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException : " + e.getMessage());
        }
        System.out.println("Handling StringIndexOutOfBoundsException:");
        // Call the method for handling exception
        handleException(text);
        // Close the Scanner
        input.close();
    }
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Access an index beyond the string's length
        System.out.println("Character at index 50: " + text.charAt(50));
    }
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // try to access an index beyond the string's length
            System.out.println("Character at index 50: " + text.charAt(50));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the text in string
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println("Demonstrating StringIndexOutOfBoundsException:");
        // Call the method for generating exception
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException : " + e.getMessage());
        }
        System.out.println("Handling StringIndexOutOfBoundsException:");
        // Call the method for handling exception
        handleException(text);
        // Close the Scanner
        input.close();
    }
}
