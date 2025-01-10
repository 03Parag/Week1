import java.util.Scanner;
// Create LargestNumberCheck class to check if first, second, or third number is largest
public class LargestNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);        
        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        // Print the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        // Close the scanner object
        input.close();
    }
}
