import java.util.Scanner;
// Create BMICalculator class to calculate the height, weight, BMI and status
public class BMICalculator {
    // Method to compute BMI and BMI status for a person
    public static String[] computeBMI(double weight, double heightCm) {
        // Convert height from cm to meters
        double heightM = heightCm / 100.0; 
        // BMI formula
        double bmi = weight / (heightM * heightM); 
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.valueOf(bmi), status};
    }
    // Method to process the height and weight array and calculate BMI and status
    public static String[][] computeBMIForTeam(double[][] heightWeightData) {
        // Columns: Height, Weight, BMI, Status
        String[][] result = new String[heightWeightData.length][4]; 
        for (int i = 0; i < heightWeightData.length; i++) {
            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];
            String[] bmiAndStatus = computeBMI(weight, height);
            // Height
            result[i][0] = String.valueOf(height); 
            // Weight
            result[i][1] = String.valueOf(weight); 
            // BMI
            result[i][2] = bmiAndStatus[0]; 
            // Status
            result[i][3] = bmiAndStatus[1]; 
        }

        return result;
    }
    // Method to display the result in a tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t\t%s%n",
                    i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Store height and weight for 10 persons
        double[][] heightWeightData = new double[10][2];
        // Enter height and weight for all persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            heightWeightData[i][0] = input.nextDouble();
            System.out.print("Enter height (in cm): ");
            heightWeightData[i][1] = input.nextDouble();
        }
        // Compute BMI and statuses
        String[][] bmiResults = computeBMIForTeam(heightWeightData);
        // Display the results
        System.out.println("BMI Report:");
        displayResults(bmiResults);
        // Close the scanner
        input.close();
    }
}
