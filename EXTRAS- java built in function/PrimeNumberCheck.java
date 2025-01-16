import java.util.Scanner;
// Create PrimeNumberCheck class to check if a number is a prime number 
public class PrimeNumberCheck {
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // If number is less than 2, it is not prime
        if (number < 2) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by any number other than 1 and itself, it's not prime
            if (number % i == 0) {
                return false;
            }
        }
        // If no factors are found, it's prime
        return true;
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Call the isPrime function to check if the number is prime
        boolean result = isPrime(number);
        // Display the result
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        // Close the scanner
        input.close();
    }
}
