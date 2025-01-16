import java.util.Scanner;
// Create TrimString class to trim the leading and trailing spaces from a string 
public class TrimString {
    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        // Find the starting index with no leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Find the ending index with no trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        // Return the start and end indices
        return new int[]{start, end};
    }
    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // If lengths are not same, strings are not same
        if (str1.length() != str2.length()) {
            return false;
        }
        // If characters are not same, strings are not same
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        // Both the strings are same
        return true;
    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Enter a string
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = input.nextLine();
        // Trim spaces using user-defined methods
        int[] trimIndices = findTrimIndices(text);
        String trimmedText = createSubstring(text, trimIndices[0], trimIndices[1]);
        // Trim spaces using built-in trim() method
        String builtInTrimmedText = text.trim();
        // Compare the results
        boolean isEqual = compareStrings(trimmedText, builtInTrimmedText);
        // Display the results
        System.out.println("Trimmed Text (User-defined): " + trimmedText);
        System.out.println("Trimmed Text (Built-in): " + builtInTrimmedText);
        System.out.println("Are both trimmed texts equal? " + isEqual);
        // Close the scanner
        input.close();
    }
}
