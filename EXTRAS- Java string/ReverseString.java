import java.util.Scanner;
// Create ReverseString class to reverse the string without using the built in reverse method
public class ReverseString {
    // Method to reverse a string
    public static String reverseString(String str) {
        // Create a new empty string to store the reversed result
        String reversed = "";
        // Loop through the original string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            // Add each character to the reversed string
            reversed += str.charAt(i); 
        }
        return reversed;
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Reverse the string
        String reversed = reverseString(text);
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        // Close the scanner
        input.close();
    }
}
