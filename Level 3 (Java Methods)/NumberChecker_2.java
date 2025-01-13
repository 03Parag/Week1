import java.util.Arrays;
// Create NumberChecker_2 class to find different methods
public class NumberChecker_2 {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                // If there's at least one non-zero digit, it's a Duck number
                return true;  
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Example number
        int number = 12021;
        // Store the digits of the number
        int[] digits = storeDigits(number);
        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));
        // Check if the number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        // Check if the number is a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        // Reverse the digits and display
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));
        // Compare original digits with reversed digits
        System.out.println("Are digits equal to reversed digits? " + areArraysEqual(digits, reversedDigits));
    }
}
