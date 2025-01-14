import java.util.Scanner;
// Create ArrayIndexOutOfBoundsProgram class to generate a exception and handle the  runtime exception 
public class ArrayIndexOutOfBoundsProgram {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Try to access an index beyond the length of the array
        System.out.println("Accessing index 10: " + names[10]);
    }
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Try to access an index beyond the length of the array
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Found an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Found a RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number of names
        System.out.print("Enter the number of names: ");
        int size = input.nextInt();
        input.nextLine(); 
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException:");
        // Call the method for generating exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        // Call the method for handling exception
        handleException(names);
        // Close the Scanner
        input.close();
    }
}
