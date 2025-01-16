import java.util.Scanner;
// Create PalindromeChecker class to check if a given string is a palindrome
public class PalindromeChecker {
    // Function to enter the string
    public static String getInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine();
    }
    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();        
        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;        
        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }        
        return true;  // The string is a palindrome
    }
    // Function to display the result
    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);        
        // Enter the string
        String inputString = getInput(input);        
        // Check if the string is a palindrome
        boolean isPalin = isPalindrome(inputString);        
        // Display the result
        displayResult(isPalin);
        // Close the scanner
        input.close();
    }
}
