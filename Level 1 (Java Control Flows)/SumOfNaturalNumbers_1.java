import java.util.Scanner;
// Create SumOfNaturalNumbers_1 class to compute sum using for loop and formula
public class SumOfNaturalNumbers_1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Declare variable for the number of natural numbers
        int n;        
        // Take user input for n
        System.out.print("Enter a natural number: ");
        n = input.nextInt();        
        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Compute sum using formula: n * (n + 1) / 2
            int formulaSum = (n * (n + 1)) / 2;            
            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }            
            // Compare the results and print if they match
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);            
            // Check if both results are the same
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("The results do not match.");
            }
        }        
        // Close the scanner object
        input.close();
    }
}
