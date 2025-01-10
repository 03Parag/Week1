import java.util.Scanner;
// Create a class FizzBuzz to print the FizzBuzz sequence
class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 0 to the user input number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is a multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the current number is a multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the current number is a multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it is not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
            }
        }
        // Close the scanner
        sc.close();
    }
}
