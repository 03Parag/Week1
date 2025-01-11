import java.util.Scanner;
// Create LargestSecondLargest class to increase th size of array so that more digits can be solved
public class LargestSecondLargest {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Initialize variables and max digits to store in array initially               
        int maxDigit = 10; 
        // Array to store digits
        int[] digits = new int[maxDigit]; 
        int index = 0;
        // Get the digits from the number
        while (number != 0) {
            if (index == maxDigit) {
                // If index equals maxDigit, increase the size of the array
                // Increase array size by 10
                maxDigit += 10; 
                // Create a new array of increased size
                int[] temp = new int[maxDigit];
                // Copy elements from digits array to temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Reassign the digits array to the temp array (now with more space)
                digits = temp;
            }
            // Get the last digit of the number
            digits[index] = number % 10; 
            // Remove the last digit
            number = number / 10; 
            // Increment the index for the array
            index++; 
        }
        // Variables to store the largest and second largest digit
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
