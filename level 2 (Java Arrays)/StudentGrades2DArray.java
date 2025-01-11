import java.util.Scanner;
// Create StudentGrades2DArray class to compute the percentage and then calculate the grade in a 2D array
public class StudentGrades2DArray {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Store marks, percentages, and grades in a 2D array
        // Columns: 0 -> Physics, 1 -> Chemistry, 2 -> Maths, 3 -> Percentage, 4 -> Grade (as int)
        double[][] studentData = new double[numberOfStudents][5];
        // Enter marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            // Columns 0, 1, 2 are for marks
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter marks for " + subject + ": ");
                    studentData[i][j] = input.nextInt();
                    if (studentData[i][j] < 0 || studentData[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                } while (studentData[i][j] < 0 || studentData[i][j] > 100);
            }
            // Calculate percentage (stored in column 3)
            studentData[i][3] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3.0;
            // Determine the grade (stored as an integer in column 4)
            if (studentData[i][3] >= 80) {
                studentData[i][4] = 1; // A
            } else if (studentData[i][3] >= 70) {
                studentData[i][4] = 2; // B
            } else if (studentData[i][3] >= 60) {
                studentData[i][4] = 3; // C
            } else if (studentData[i][3] >= 50) {
                studentData[i][4] = 4; // D
            } else if (studentData[i][3] >= 40) {
                studentData[i][4] = 5; // E
            } else {
                studentData[i][4] = 6; // R
            }
        }
        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + (int) studentData[i][0]);
            System.out.println("Chemistry: " + (int) studentData[i][1]);
            System.out.println("Maths: " + (int) studentData[i][2]);
            System.out.printf("Percentage: %.2f%%\n", studentData[i][3]);
            // Convert grade from integer to string
            String grade;
            switch ((int) studentData[i][4]) {
                case 1:
                    grade = "A";
                    break;
                case 2:
                    grade = "B";
                    break;
                case 3:
                    grade = "C";
                    break;
                case 4:
                    grade = "D";
                    break;
                case 5:
                    grade = "E";
                    break;
                default:
                    grade = "R";
                    break;
            }
            System.out.println("Grade: " + grade);
        }
        // Close the Scanner
        input.close();
    }
}

