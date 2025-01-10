import java.util.Scanner;
// Create a class PrimeNumber to check if a number is prime
class PrimeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Initialize isPrime as true
            boolean isPrime = true;
            // Loop through numbers from 2 to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by i
                    break; // Exit the loop
                }
            }
            // Output result based on the isPrime variable
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        // Close the scanner
        sc.close();
    }
}
