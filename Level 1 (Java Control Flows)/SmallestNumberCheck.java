import java.util.Scanner;
// Create SmallestNumberCheck class to check if the first number is the smallest
public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the three numbers by user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        // Print the result
        System.out.println("Is the first number the smallest? " + isSmallest);
        // Close the scanner object
        input.close();
    }
}
