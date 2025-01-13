import java.util.Scanner;
// Create HandshakesCalculator_1 to find the maximum number of handshakes among students.
public class HandshakesCalculator_1 {
    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        // Formula for combination
        return (numberOfStudents * (numberOfStudents - 1)) / 2; 
    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number of students
        System.out.print("Enter the number of students: ");
        // Enter number of students as input
        int numberOfStudents = input.nextInt(); 
        // Check if the number of students= <= 2
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(numberOfStudents);
            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }
        // Close the scanner
        input.close();
    }
}
