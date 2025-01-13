import java.util.Scanner;
// Create BMI_Calculator class to find the BMI and display the height, weight, BMI and status of each individual
public class BMI_Calculator {
    // Method to calculate BMI for each person 
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            // Convert height from cm to meters
            double heightInMeters = heightInCm / 100;
            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            // Store BMI in the third column of the 2D array
            data[i][2] = bmi;
        }
    }
    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array to store weight (kg), height (cm), and BMI for 10 persons
        double[][] data = new double[10][3];
        // Taking user input for weight and height
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Enter weight (kg): ");
            data[i][0] = input.nextDouble();
            System.out.print("Person " + (i + 1) + " - Enter height (cm): ");
            data[i][1] = input.nextDouble();
        }
        // Calculate BMI for each person
        calculateBMI(data);
        // Determine BMI status for each person
        String[] statuses = determineBMIStatus(data);
        // Display the height, weight, BMI, and status for each person
        System.out.println("\nBMI and Status of each individual:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + data[i][0] + " kg, Height: " + data[i][1] + " cm, BMI: " + data[i][2]);
            System.out.println("BMI Status: " + statuses[i]);
        }
        input.close();
    }
}
