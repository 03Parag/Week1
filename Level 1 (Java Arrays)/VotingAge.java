import java.util.Scanner;
// Create VotingAge class to check whether a student can vote using an array
public class VotingAge {
    public static void main(String[] args) {
        // Declare variable for the number of students
        int totalStudent = 10;
        // Array of the student ages
        int[] ages = new int[totalStudent];
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the age of the students
        System.out.println("Enter the ages of " + totalStudent + " students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        // Check if the students can vote or not
        System.out.println("\nVoting Eligibility Results:");
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        // Close the Scanner
        input.close();
    }
}
