import java.util.Scanner;
// Create NumberCheck class to find if the number is positive, negative or zero
public class NumberCheck {
    // Method to check whether a number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
    // Method to check whether a number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            // number1 is greater
            return 1;  
        } else if (number1 == number2) {
            // both are equal
            return 0;  
        } else {
            // number1 is less
            return -1; 
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Store 5 numbers in an array
        int[] numbers = new int[5];
        // Enter 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }
        // Check positive/negative, even/odd
        for (int i = 0; i < 5; i++) {
            int number = numbers[i];
            String sign = isPositive(number);
            if (sign.equals("positive")) {
                String evenOdd = isEven(number);
                System.out.println("Number " + number + " is positive and " + evenOdd + ".");
            } else if (sign.equals("negative")) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }
        // Compare the first and last elements
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
        // Close the scanner
        input.close();
    }
}
