import java.util.Scanner;
// Create OddEvenArrays class to print the odd and even numbers in different array
public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the value from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        // Check if the number is a natural number and if not print error
        if (number <= 0) {
            System.err.println("Invalid number ");
            System.exit(0);
        }
        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        // Index variables for odd and even numbers initialize from zero
        int oddIndex = 0;
        int evenIndex = 0;
        // Loop  from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Add to even numbers array
                evenNumbers[evenIndex++] = i; 
            } else {
                // Add to odd numbers array
                oddNumbers[oddIndex++] = i; 
            }
        }
        // Print the odd numbers array
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        // Print the even numbers array
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        // Close the Scanner
        input.close();
    }
}
