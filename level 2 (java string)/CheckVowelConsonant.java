import java.util.Scanner;
// Create CheckVowelConsonant class to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
public class CheckVowelConsonant {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert to lowercase if uppercase
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
    // Method to process the string and return a 2D array of characters and their types
    public static String[][] processString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String type = checkCharacter(ch);
            result[i][0] = String.valueOf(ch);
            result[i][1] = type;
        }
        return result;
    }
    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] array) {
        System.out.printf("%-10s %-15s%n", "Character", "Type")
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-10s %-15s%n", array[i][0], array[i][1]);
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter a string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Process the string to get the character types
        String[][] result = processString(text);
        // Display the result in a tabular format
        displayResult(result);
        // Close the Scanner
        input.close();
    }
}
