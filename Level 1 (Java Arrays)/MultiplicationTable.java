import java.util.Scanner;
// Create MultiplicationTable class to print a multiplication table of a number using array
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input a number from the user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();
        // Store the results of multiplication from 1 to 10 in an array
        int[] table = new int[10];
        // Store results in array after loop
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }
        // Display the results
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        // Close the Scanner
        input.close();
    }
}
