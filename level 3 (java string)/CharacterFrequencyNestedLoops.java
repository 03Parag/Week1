import java.util.Scanner;
// Create CharacterFrequencyNestedLoops class to find the frequency of characters in a string using nested loops 
public class CharacterFrequencyNestedLoops {
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        // Store frequencies of characters
        int[] frequency = new int[charArray.length];
        // Initialize all frequencies to -1
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = -1;
        }
        // Outer loop to iterate through each character
        for (int i = 0; i < charArray.length; i++) {
            // Initialize frequency for the current character
            int count = 1; 
            // Skip already processed characters
            if (frequency[i] != -1) {
                continue;
            }
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    // Mark duplicate characters as processed
                    frequency[j] = 0; 
                }
            }
            // Store the frequency of the current character
            frequency[i] = count;
        }
        // Count the number of unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }
        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        // Fill the result array with characters and their frequencies
        for (int i = 0; i < charArray.length; i++) {
            if (frequency[i] > 0) {
                result[index] = "Character: '" + charArray[i] + "', Frequency: " + frequency[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Call the method to find the frequency of characters
        String[] frequencies = findCharacterFrequency(text);
        // Display the result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i]);
        }
        // Close the scanner
        input.close();
    }
}
