import java.util.Scanner;
// Create PalindromeCheck class to check if a string is a palindrome
public class PalindromeCheck {
    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Convert the string to lowercase 
        str = str.toLowerCase();
        // Use two pointers to check characters from the start and end
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            // Compare characters at the start and end
            if (str.charAt(start) != str.charAt(end)) {
                // If mismatch, it's not a palindrome
                return false; 
            }
            start++;
            end--;
        }
        // If all characters match, it's a palindrome
        return true; 
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.println("Enter a string:");
        String text = input.nextLine();
        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(text);
        // Display the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        // Close the scanner
        input.close();
    }
}
