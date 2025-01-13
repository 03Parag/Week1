import java.util.Scanner;
// Create HandshakesCalculator to find the maximum number of handshakes among N number of students.
public class HandshakesCalculator {
    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Formula for combination
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number of students
        System.out.print("Enter the number of students: ");
        // Enter number of students as input
        int n = input.nextInt(); 
        // Check if the number of students= <= 2
        if (n < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);
            // Display the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }
        // Close the scanner
        input.close();
    }
}
