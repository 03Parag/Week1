import java.util.Scanner;
// Create StoreAndSum class to store number upto 10 or till value is positive and sum them all 
public class StoreAndSum {
    public static void main(String[] args) {
        // Store up to 10 elements in an array
        double[] numbers = new double[10];
        // Store the total and initialize it  to 0.0
        double total = 0.0;
        // Index of array and initialize it to 0
        int index = 0;
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Infinite while loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();
            // Check if the number is 0 or a negative 
            if (number <= 0) {
                break;
            }
            // Check if the array reached its limit
            if (index == 10) {
                System.out.println("Array reached its limit and no more numbers can be entered.");
                break;
            }
            // Assign the number to array and increment index
            numbers[index] = number;
            index++;
        }
        // Calculate the total and display the numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        // Display the total value
        System.out.println("\nTotal of the numbers: " + total);
        // Close the Scanner
        input.close();
    }
}
