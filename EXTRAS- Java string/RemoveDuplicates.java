import java.util.Scanner;
// Create RemoveDuplicates class to remove all the duplicate characters in a given string
public class RemoveDuplicates {
    // Method to remove duplicate characters from a string
    public static String removeDuplicateCharacters(String str) {
        // Initialize an empty string to store the result
        String result = ""; 
        // Array to track seen characters (ASCII values)
        boolean[] seen = new boolean[256]; 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!seen[currentChar]) {
                // Add the character to the result if not already seen
                result += currentChar; 
                // Mark the character as seen
                seen[currentChar] = true; 
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Call the method to remove duplicate characters
        String modifiedString = removeDuplicateCharacters(text);
        // Display the result
        System.out.println("Modified string without duplicates: " + modifiedString);
        // Close the scanner
        input.close();
    }
}
