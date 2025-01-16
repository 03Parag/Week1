import java.util.Scanner;
// Create PalindromeCheck class to check if a text is palindrome
public class PalindromeCheck {    
    // Logic 1: Iterative Approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                // Not a palindrome
                return false; 
            }
            start++;
            end--;
        }
        // Palindrome
        return true; 
    }
    // Logic 2: Recursive Approach
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If characters at start and end are not equal, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recurse with incremented start and decremented end
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    // Logic 3: Using character arrays (String reversal)
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];       
        // Reverse the string
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }        
        // Compare the original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                // Not a palindrome
                return false; 
            }
        }
        // Palindrome
        return true; 
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);        
        // Enter the string
        System.out.println("Enter a text:");
        String text = input.nextLine();        
        // Call and display results for each method
        // Logic 1: Iterative approach
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Is palindrome (Iterative): " + resultIterative);        
        // Logic 2: Recursive approach
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Is palindrome (Recursive): " + resultRecursive);        
        // Logic 3: Using char arrays (String reversal)
        boolean resultCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Is palindrome (Using char array): " + resultCharArray);        
        // Close the scanner
        input.close();
    }
}
