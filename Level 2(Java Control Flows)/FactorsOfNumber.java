import java.util.Scanner;
// Create a class FactorsOfNumber to find the factors of a number
class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        // Loop from i = 1 to i < number to find factors
        for (int i = 1; i < number; i++) {
            // Check if number is divisible by i (perfect division)
            if (number % i == 0) {
                // Print the factor if divisible
                System.out.println(i);
            }
        }
        // Close the scanner
        sc.close();
    }
}
