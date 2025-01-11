import java.util.Scanner;
// Create a  NumberAnalysis class to check whether a number is positive, negative or zero
public class NumberAnalysis {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        // Loop through the array and check conditions
        System.out.println("\nAnalysis of the numbers:");
        for (int number : numbers) {
            if (number > 0) {
                // Positive number
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                // Negative number
                System.out.println(number + " is negative.");
            } else {
                // Zero
                System.out.println(number + " is zero.");
            }
        }
        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("\nComparison of the first and last elements:");
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        // Close the Scanner
        input.close();
    }
}
