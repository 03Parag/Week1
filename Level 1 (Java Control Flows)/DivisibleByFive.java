import java.util.Scanner;
// Create DivisibleByFive class to check divisibility by 5
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the number to be cheked 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check if the number is divisible by 5
        boolean isDivisible = (number % 5 == 0);
        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        // Close the scanner object
        input.close();
    }
}
