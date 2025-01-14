import java.util.Scanner;
// Create TextTolowercaseConversionComparison class to  convert the text to lowercase and compare the result of two string using charAt() and built-in string method toLowerCase()
public class TextToLowercaseConversionComparison {
    // Method to convert text to lowercase using charAt()
    public static String textToLowercaseUsingCharAt(String text) {
        // Initialize the lowercasetext
        String lowercaseText = "";
        // Loop through all the text length 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert to lowercase if it's an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase
                ch = (char) (ch + 32); 
            }
            lowercaseText += ch;
        }
        return lowercaseText;
    }
    // Method to compare 2 strings using charAt()
    public static boolean compareStringsUsingCharAt(String string1, String string2) {
        // If lengths are not same, strings are not same
        if (string1.length() != string2.length()) {
            return false;
        }
        // If characters are not same, strings are not same 
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        // Both string are equal
        return true;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter value in the string
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        // Convert text to lowercase using charAt() method
        String charAtLowercaseText = textToLowercaseUsingCharAt(text);
        // Convert text to lowercase using built-in toLowerCase() method
        String builtInLowercaseText = text.toLowerCase();
        // Compare the two results
        boolean isEqual = compareStringsUsingCharAt(charAtLowercaseText, builtInLowercaseText);
        // Display results
        System.out.println("Original Text: " + text);
        System.out.println("CharAt Lowercase Text: " + charAtLowercaseText);
        System.out.println("Built-In Lowercase Text: " + builtInLowercaseText);
        System.out.println("Are both conversions equal? " + isEqual);
        // Close the scanner
        input.close();
    }
}
