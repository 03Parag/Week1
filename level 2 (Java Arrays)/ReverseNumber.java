import java.util.Scanner;
// Create ReverseNumber class to reverse the number 
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number by user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Find the count of digits in number and initialize the count
        int temp = number;
        int count = 0;
        // If temp is not zero
        while (temp != 0) {
            // Remove the last digit
            temp = temp / 10;  
            // Increase digit count
            count++;           
        }
        // Store the digits in an array
        int[] digits = new int[count];
        // Reset the number
        temp = number;  
        // Initialize the index
        int index = 0;
        // Store each digit in  array
        while (temp != 0) {
            // Get the last digit
            digits[index] = temp % 10;  
            // Remove the last digit
            temp = temp / 10;          
            // Increment the index by one
            index++;
        }
        // Store the digits in reverse order in other array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            // Reverse the order
            reversed[i] = digits[count - 1 - i];  
        }
        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }
        // Close the scanner
        input.close();
    }
}
