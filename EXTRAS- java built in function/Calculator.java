import java.util.Scanner;
// Create Calculator class to calculate mathematical operations (addition, subtraction, multiplication, division)
public class Calculator {
    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }
    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    // Function for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            // Return NaN for division by zero
            return Double.NaN;  
        }
        return a / b;
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);        
        // Prompt user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        // Choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");        
        int choice = input.nextInt();
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        // Close the scanner
        input.close(); 
    }
}
