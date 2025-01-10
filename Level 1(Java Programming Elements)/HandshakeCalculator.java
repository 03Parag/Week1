import java.util.Scanner;
// Create HandshakeCalculator to calculate maximum number of handshakes 
public class HandshakeCalculator {
    public static void main(String[] args) {
        // Declare the variable numberOfStudents
        int numberOfStudents;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the number of students
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Print the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
        // Close the scanner object
        input.close();                          
    }
}
