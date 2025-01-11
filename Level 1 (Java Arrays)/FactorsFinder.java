import java.util.Scanner;
// Create FactorsFinder class to  find the factors of a number and store and display it in array
public class FactorsFinder {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number to find the factors
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        // Initialize maxFactor , index and factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        // Loop it from 1 to the given number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Add factor to the array
                if (index == maxFactor) {
                    // Resize the array if needed and Double the size
                    maxFactor *= 2; 
                    // Create a temporary array
                    int[] temp = new int[maxFactor]; 
                    // Copy old factors to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length); 
                    // Assign the new array to factors
                    factors = temp; 
                }
                // Store the factor in the array and increment index
                factors[index++] = i; 
            }
        }
        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        // Close the Scanner
        input.close();
    }
}
