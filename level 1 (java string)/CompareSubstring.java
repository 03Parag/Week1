import java.util.Scanner;
// Create CompareSubstring class to compare the strings  
public class CompareSubstring {
    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        // Create an empty string
        String substring = "";
        // Concatenate characters from start index to end index
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // Both strings are equal
        return true; 
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string and the index
        System.out.print("Enter the string: ");
        String text = input.next();
        System.out.print("Enter the start index: ");
        int startIndex = input.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = input.nextInt();
        // Create substring using the charAt method
        String charAtSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);
        // Create substring using the substring() method
        String builtInSubstring = text.substring(startIndex, endIndex);
        // Compare the substrings 
        boolean comparisonResult = compareStringsUsingCharAt(charAtSubstring, builtInSubstring);
        // Display the results
        System.out.println("Substring using custom method: " + charAtSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + comparisonResult);
        // Close the scanner
        input.close();
    }
}
