import java.util.Scanner;
// Create AnagramCheck class to check if two texts are anagrams
public class AnagramCheck {
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }        
        // Store the frequency of characters for both strings
        // To store frequency of characters in text1
        int[] frequency1 = new int[256];  
        // To store frequency of characters in text2
        int[] frequency2 = new int[256];          
        // Loop through both strings and count the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }        
        // Compare the frequency arrays for both strings
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                // If any character's frequency does not match, it's not an anagram
                return false;  
            }
        }
        // If all frequencies match, it's an anagram
        return true;  
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);  
        // Enter the 2 texts
        System.out.println("Enter the first text:");
        String text1 = input.nextLine();
        System.out.println("Enter the second text:");
        String text2 = input.nextLine();
        // Call the method to check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);
        // Display the result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
        // Close the scanner
        input.close();
    }
}
