import java.util.Scanner;
// Create VoteChecker class to check if a student can vote
public class VoteChecker {
    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        // Check if the age is negative
        if (age < 0) {
            // Invalid age, cannot vote
            return false; 
        }
        // Check if the age is 18 or greater
        return age >= 18;
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Array to store the ages of 10 students
        int[] studentAges = new int[10];
        // Enter each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
            // Check if the student can vote and display the result
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        // Close the scanner
        input.close();
    }
}
