import java.util.Scanner;
// Create QuotientAndRemainder class to find the reminder and the quotient of a number
public class QuotientAndRemainder {
    // Method to find the remainder and quotient 
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate quotient
        int quotient = number / divisor; 
        // Calculate remainder
        int remainder = number % divisor; 
        // Return remainder and quotient
        return new int[]{quotient, remainder}; 
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the number and the divisor
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();
        // Ensure divisor is not zero 
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please enter a valid divisor.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);
            // Display the results
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }
        // Close the scanner
        input.close();
    }
}
