import java.util.Arrays;
// Create NumberChecker_1 class to check different methods
public class NumberChecker_1 {
    // Method to find the count of digits 
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    // Method to store the digits of the number
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // Method to find the sum of the digits of a number 
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    // Method to find the sum of the squares of the digits of a number 
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    // Method to check if a number is a Harshad number 
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    // Method to find the frequency of each digit in the number
    public static int[][] findFrequencyOfDigits(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        // Example number
        int number = 12321;
        // Store the digits of the number
        int[] digits = storeDigits(number);
        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));
        // Display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        // Display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        // Check if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        // Find and display the frequency of each digit
        int[][] frequency = findFrequencyOfDigits(digits);
        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i][1]);
            }
        }
    }
}
