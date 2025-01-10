import java.util.Scanner;
// Create a class PowerOfNumber to calculate the power of a number
class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Take user input for the number and power
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        // Initialize the result variable to 1
        int result = 1;
        // Loop from 1 to power to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the number in each iteration
        }
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result); 
        // Close the scanner
        sc.close();
    }
}
