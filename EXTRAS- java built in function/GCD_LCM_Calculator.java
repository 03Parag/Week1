import java.util.Scanner;
// Create GCD_LCM_Calculator class to calculate the GCD and LCD 
public class GCD_LCM_Calculator {
    // Function to calculate the Greatest Common Divisor (GCD) 
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // Function to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int a, int b) {
        return Math.abs(a * b) / calculateGCD(a, b);
    }
    // Function to take input from the user
    public static int[] getInput() {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        // Close the scanner
        input.close();  
        return new int[] { num1, num2 };
    }
    // Function to display the result
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("For numbers " + num1 + " and " + num2 + ":");
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }
    public static void main(String[] args) {
        // Enter the number
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];
        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);
        // Display the result
        displayResult(num1, num2, gcd, lcm);
    }
}
