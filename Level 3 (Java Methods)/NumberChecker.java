import java.util.Arrays;
// Create NumberChecker class to find different methods
public class NumberChecker {
    // Method to find the count of digits in the number
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
    // Method to check if a number is a duck number
    // A duck number has at least one non-zero digit after the first digit
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                // Found a non-zero digit after the first digit
                return true; 
            }
        }
        return false;
    }
    // Method to check if the number is an Armstrong number
    // Armstrong number is equal to the sum of its own digits raised to the power of the number of digits
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }
    // Method to find the largest and second largest elements 
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }
    // Method to find the smallest and second smallest elements 
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;       
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }
    public static void main(String[] args) {
        // Example number
        int number = 153;
        // Store the digits of the number
        int[] digits = storeDigits(number);        
        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));        
        // Check if the number is a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        // Check if the number is an Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        // Find the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        // Find the smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}
