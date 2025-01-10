import java.util.Scanner;
// Create MultiplicationTable class to generate table for a given number
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Declare a variable to store the number
        int number;
        // Take user input for the number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        number = input.nextInt();
        // Use a for loop to generate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        // Close the scanner object
        input.close();
    }
}
