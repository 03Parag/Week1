import java.util.Scanner;
// Create CharacterFrequency class to find the frequency of characters in a string using charAt() method 
public class CharacterFrequency {
    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String str) {
        // Array to store the frequency of each ASCII character
        int[] frequency = new int[256];
        // Calculate frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        // Count the number of unique characters
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }
        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        // Fill array with characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                // Character
                result[index][0] = Character.toString((char) i); 
                // Frequency
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take the input string
        System.out.println("Enter a string:");
        String text = input.nextLine();

        // Call the method to find frequency
        String[][] frequency = findFrequency(text);

        // Display the result
        for (int i = 0; i < frequency.length; i++) {
        System.out.println("Character is: "+ frequency[i][0] + ", Frequency is: " + frequency[i][1]);
        }
        // Close the scanner
        input.close();
    }
}
