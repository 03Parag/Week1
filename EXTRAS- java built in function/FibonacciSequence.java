import java.util.Scanner;
// Create FibonacciSequence class to generates the Fibonacci sequence up to a specified number of terms entered by the user
public class FibonacciSequence {
    // Function to calculate and print the Fibonacci sequence
    public static void printFibonacci(int terms) {
        // First two Fibonacci numbers
        int a = 0, b = 1;
        // If the user asks for only 1 term, print 0
        if (terms >= 1) {
            System.out.print(a + " ");
        }        
        // If the user asks for 2 or more terms, print 1 and proceed to generate the sequence
        if (terms >= 2) {
            System.out.print(b + " ");
        }
        // Generate the Fibonacci sequence starting from the 3rd term
        for (int i = 3; i <= terms; i++) {
            // Next term is the sum of the previous two terms
            int nextTerm = a + b;  
            System.out.print(nextTerm + " ");
            // Update a to the previous b
            a = b;  
            // Update b to the newly calculated term
            b = nextTerm;  
        }
        // Print a newline at the end for neatness
        System.out.println();  
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number of terms in the Fibonacci sequence
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = input.nextInt();
        // Call the printFibonacci function to display the Fibonacci sequence
        printFibonacci(terms);
        // Close the scanner
        input.close();
    }
}
