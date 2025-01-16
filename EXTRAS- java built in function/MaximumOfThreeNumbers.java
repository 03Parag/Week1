import java.util.Scanner;
// Create MaximumOfThreeNumbers class to find the maximum of three numbers
public class MaximumOfThreeNumbers {
    // Function to take integer input from the user
    public static int getInput(String text, Scanner input) {
        System.out.print(text);
        return input.nextInt();
    }
    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        // Assume num1 is the largest initially
        int max = num1;
        if (num2 > max) {
            // num2 is larger, so update max
            max = num2;
        }
        if (num3 > max) {
            // num3 is larger, so update max
            max = num3;
        }
        return max;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter three integer inputs 
        int num1 = getInput("Enter the first number: ", input);
        int num2 = getInput("Enter the second number: ", input);
        int num3 = getInput("Enter the third number: ", input);
        // Find the maximum of the three numbers
        int maximum = findMaximum(num1, num2, num3);
        // Display the result
        System.out.println("The maximum number is: " + maximum);
        // Close the scanner
        input.close();
    }
}
