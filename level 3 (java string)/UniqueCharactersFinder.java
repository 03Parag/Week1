import java.util.Scanner;
// Create UniqueCharactersFinder class to find unique characters in a string using charAt() method and display the result 
public class UniqueCharactersFinder {
    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                // Access each character until an exception occurs
                text.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Find an IndexOutOfBoundsException: " + e.getMessage());
        }
        // Return the total count
        return count;
    }
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        // Find the length of the string
        int length = findLength(text); 
        // Array to store unique characters
        char[] uniqueChars = new char[length]; 
        // Counter for unique characters
        int uniqueCount = 0; 
        // Outer loop iterates through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            // Inner loop checks if the character is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false; // Character is not unique
                    break;
                }
            }
            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }
    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        // Display the unique characters
        displayUniqueCharacters(uniqueChars);
        // Close the scanner
        input.close();
    }
}
