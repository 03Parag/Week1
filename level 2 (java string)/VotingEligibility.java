import java.util.Scanner;
import java.util.Random;
// Create VotingEligibility class to check if a student can vote or not
public class VotingEligibility {
    // Method to generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate random age between 10 and 99
            ages[i] = random.nextInt(90) + 10; 
        }
        return ages;
    }
    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "False (Invalid Age)";
            } else if (ages[i] >= 18) {
                results[i][1] = "True (Can Vote)";
            } else {
                results[i][1] = "False (Cannot Vote)";
            }
        }
        return results; 
    }   
    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tVoting Eligibility");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" + results[i][1]);
        }
    }
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // Enter the number of students 
        System.out.print("Enter the number of students in the class: ");
        int n = input.nextInt();
        // Generate random ages
        int[] ages = generateRandomAges(n);
        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);
        // Display results
        System.out.println("Voting Eligibility Results:");
        displayResults(results);
        // Close the scanner
        input.close();
    }
}
