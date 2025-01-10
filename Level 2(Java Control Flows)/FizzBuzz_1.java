import java.util.Scanner;
// Create a class FizzBuzz_1 to print the FizzBuzz sequence
class FizzBuzz_1 {
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
            // Initialize the counter variable
            int i = 1;
            // Loop using a while loop
            while (i <= number) {
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
                // Increment the counter
                i++;
            }
        }
        // Close the scanner
        sc.close();
    }
}
