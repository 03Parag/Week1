import java.util.Scanner;
// Create  class to count the number of vowels and consonants in a given string
public class CountVowelConsonant {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert character to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If it's not a letter
        return "Not a Letter";
    }
    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        // Loop through each character in the string
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            }
            if (result.equals("Consonant")) {
                consonants++;
            }
            i++;
        }
        // Return the count of vowels and consonants 
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter a string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);
        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        // Close the scanner
        input.close();
    }
}
