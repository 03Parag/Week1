import java.util.Scanner;
// Create a class GreatestFactor to find the greatest factor of a number beside itself
class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Initialize greatestFactor variable
        int greatestFactor = 1;
        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor
                greatestFactor = i; // Update greatestFactor
                break; // Exit the loop after finding the greatest factor
            }
        }
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        // Close the scanner
        sc.close();
    }
}
