import java.util.Scanner;
// Create TextToUppercaseConversionComparison class to  convert the text to uppercase and compare the result of two string using charAt() and built-in string method toUpperCase()
public class TextToUppercaseConversionComparison {
    // Method to convert text to uppercase using charAt()
    public static String textToUppercaseUsingCharAt(String text) {
        // Initialize the uppercasetext with void
        String uppercaseText = "";
        // Loop through all the text length 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert to uppercase if it's a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase
                ch = (char) (ch - 32);
            }
            uppercaseText += ch;
        }
        return uppercaseText;
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
        // Convert text to uppercase using charAt() method
        String charAtUppercaseText = textToUppercaseUsingCharAt(text);
        // Convert text to uppercase using built-in toUpperCase() method
        String builtInUppercaseText = text.toUpperCase();
        // Compare the two results
        boolean isEqual = compareStringsUsingCharAt(charAtUppercaseText, builtInUppercaseText);
        // Display results
        System.out.println("Original Text: " + text);
        System.out.println("CharAt Uppercase Text: " + charAtUppercaseText);
        System.out.println("Built-In Uppercase Text: " + builtInUppercaseText);
        System.out.println("Are both conversions equal? " + isEqual);
        // Close the scanner
        input.close();
    }
}
