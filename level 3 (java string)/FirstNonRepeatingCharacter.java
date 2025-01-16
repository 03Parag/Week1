import java.util.Scanner;
// Craete FirstNonRepeatingCharacter class to find the first non repating character in a string
public class FirstNonRepeatingCharacter {
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        // Create an array to store the frequency of each character (ASCII values: 0-255)
        int[] frequency = new int[256];
        // Calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        // Find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                // Return the first non-repeating character
                return currentChar; 
            }
        }
        // Null character to indicate no non-repeating character found
        return '\0'; 
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter a string 
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingChar(text);
        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
        // Close the scanner
        input.close();
    }
}
