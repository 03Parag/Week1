import java.util.Scanner;
// Create VowelConsonantCounter class to count the number of vowels and consonants ina string
public class VowelConsonantCount {
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        // Convert character to lowercase
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        // Display the result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        // Close the scanner
        input.close();
    }
}
