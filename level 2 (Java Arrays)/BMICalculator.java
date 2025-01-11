import java.util.Scanner;
// Create BMICalculator class to find the BMI and display the height, weight, BMI and status of each person
public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the number of persons by user
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();
        // Store weight, height, BMI, and status of each person in array
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        // Enter the height and weight 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the weight (kg) of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            System.out.print("Enter the height (m) of person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            // Calculate BMI 
            bmi[i] = weight[i] / (height[i] * height[i]);
            // Find the weight status based on BMI
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        // Display the results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + heights[i] + " m, Weight = " + weights[i] + " kg, BMI = " + bmis[i] + ", Status = "
        }
        // Close the scanner
        input.close();
    }
}
