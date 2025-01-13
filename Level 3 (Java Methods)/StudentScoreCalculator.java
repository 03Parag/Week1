import java.util.Random;
import java.util.Scanner;
// Create StudentScoreCalculator class to calculate the total, average, and the percentage score
public class StudentScoreCalculator {
    // Method to generate random PCM scores for students
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            // Generate random scores (2-digit numbers) for Physics, Chemistry, and Math
            scores[i][0] = 10 + random.nextInt(90); // Physics
            scores[i][1] = 10 + random.nextInt(90); // Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Math
        }
        return scores;
    }
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int math = scores[i][2];
            // Calculate total, average, and percentage
            int total = physics + chemistry + math;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // Store rounded values in the results array
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Generate random PCM scores
        int[][] scores = generateRandomScores(numStudents);
        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores);
        // Display the scorecard
        displayScorecard(scores, results);
        input.close();
    }
}
