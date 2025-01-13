import java.util.Scanner;
// Create ChocolateDivision class to find the number of chocolates each child gets and number of remaining chocolates
public class ChocolateDivision {
    // Method to find the chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Chocolates each child gets
        int quotient = number / divisor; 
        // Remaining chocolates
        int remainder = number % divisor; 
        // Return chocolates each child gets and the remaining chocolates
        return new int[]{quotient, remainder}; 
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the number of chocolates and number of children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();
        // Ensure the number of children is not zero 
        if (numberOfChildren == 0) {
            System.out.println("The number of children cannot be zero. Please enter a valid number.");
        } else {
            // Calculate the chocolates distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            // Display the results
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("The remaining chocolates are: " + result[1]);
        }
        // Close the scanner
        input.close();
    }
}
