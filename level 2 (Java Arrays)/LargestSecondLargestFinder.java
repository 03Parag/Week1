import java.util.Scanner;
// Create LargestSecondLargestFinder class to find the largest and second largest number 
public class LargestSecondLargestFinder {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Initialize variables and max digits store in array
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;
        // Get the digits from the number
        while (number != 0) {
            // If max digits reached, stop the loop
            if (index == maxDigit)
                break; 
            // Get the last digit  
            digits[index] = number % 10; 
            // Remove the last digit
            number = number / 10; 
            // Increment the index 
            index++; 
        }
        // Store the largest and second largest digit
        int largest = -1;
        int secondLargest = -1;
        // Find the largest and second largest using loop
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        // Display the results
        if (secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found.");
        }
        // Close the scanner
        input.close();
    }
}
