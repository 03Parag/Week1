import java.util.Scanner;
// Create UniqueCharacterFrequency class to find unique characters and their frequencies
public class UniqueCharacterFrequency {
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        // Store unique characters 
        char[] uniqueChars = new char[str.length()];
        int uniqueCount = 0;
        // Nested loop to find unique characters
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            // Check if the character already exists in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            // If the character is unique, add it to the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i]; 
            System.out.println("Unique Character Stored: " + result[i]); 
        }
        return result;
    }
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        // Call the findUniqueCharacters method to get the unique characters
        char[] uniqueChars = findUniqueCharacters(str);
        // Store the frequency of characters
        int[] frequency = new int[uniqueChars.length];
        // Calculate frequencies
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = 0; j < uniqueChars.length; j++) {
                if (currentChar == uniqueChars[j]) {
                    frequency[j]++;
                    break;
                }
            }
        }
        // Create a 2D String array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            // Store the character
            result[i][0] = Character.toString(uniqueChars[i]); 
            // Store the frequency
            result[i][1] = Integer.toString(frequency[i]);     
        }
        // Return the result
        return result;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Call the method to find the frequency of characters
        String[][] frequencies = findCharacterFrequency(text);
        // Display the result
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Unique character is: " + frequencies[i][0] + ", Frequency is: " + frequencies[i][1]);
        }
        // Close the scanner
        input.close();
    }
}
