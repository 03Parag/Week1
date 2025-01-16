import java.util.Scanner;
// Create AnagramCheck class to check if 2 strings are anagrams of each other
public class AnagramCheck {
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert both strings to lowercase to make the check case-insensitive
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Loop through each character in the first string
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            // Find the first occurrence of the current character in the second string
            int indexInSecondString = str2.indexOf(currentChar);
            // If the character is not found or has already been used in the second string, return false
            if (indexInSecondString == -1) {
                return false;
            }
            // Remove the character from the second string by setting it to an unused character (like a space)
            str2 = str2.substring(0, indexInSecondString) + " " + str2.substring(indexInSecondString + 1);
        }
        // If all characters match, return true
        return true;
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);        
        // Enter two strings 
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();        
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }        
        // Close the scanner
        input.close();
    }
}
