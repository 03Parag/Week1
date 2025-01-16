import java.util.Random;
// Create StudentGradeCalculator class to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format
public class StudentGradeCalculator {
    // Method to generate random PCM scores for all students
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        // 3 columns for Physics, Chemistry, and Maths
        int[][] scores = new int[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            // Physics: random scores between 50 and 100
            scores[i][0] = random.nextInt(51) + 50; 
            // Chemistry random scores between 50 and 100
            scores[i][1] = random.nextInt(51) + 50; 
            // Maths random scores between 50 and 100  
            scores[i][2] = random.nextInt(51) + 50; 
        }
        return scores;
    }
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        // Total, Average, Percentage
        double[][] results = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            // Round to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }
    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] percentages) {
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        int numStudents = 10; // Number of students
        // Generate random scores for students
        int[][] scores = generateRandomScores(numStudents);
        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalsAndPercentages(scores);
        // Determine grades based on percentages
        String[] grades = calculateGrades(results);
        // Display the scorecard
        System.out.println("Student Scorecard:");
        displayScorecard(scores, results, grades);
    }
}
