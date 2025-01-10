import java.util.Scanner;
// Create DoubleOperation to solve double operations
public class DoubleOperation {
    public static void main(String[] args) {
        // Declare the variables as double
        double a, b, c;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        c = input.nextDouble();
        // Perform the double operations
        // Multiplication (*) has higher precedence than addition (+)
        double result1 = a + b * c;  
        // Multiplication (*) is performed before addition (+)
        double result2 = a * b + c; 
        // Division (/) is performed before addition (+)
        double result3 = c + a / b; 
        // Modulus (%) is performed before addition (+)
        double result4 = a % b + c; 
        // Print the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        // Close the scanner object
        input.close();
    }
}

 