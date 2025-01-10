import java.util.Scanner;
// Create IntOperation to solve integer operations
public class IntOperation {
    public static void main(String[] args) {
        // Declare the variable int a.b,c
        int a,b,c;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter values for a, b, and c
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        System.out.print("Enter the value of c: ");
        c = input.nextInt();
        // Perform the integer operations 
        // Multiplication (*) has higher precedence than addition (+)
        int result1 = a + b * c;  
        // Multiplication (*) is performed before addition (+)
        int result2 = a * b + c; 
        // Division (/) is performed before addition (+)
        int result3 = c + a / b; 
        // Modulus (%) is performed before addition (+)
        int result4 = a % b + c; 
        // Print the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        // Close the scanner object
        input.close();
    }
}

 