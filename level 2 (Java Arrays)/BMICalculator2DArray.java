import java.util.Scanner;
// Create BMICalculator2DArray class to find the BMI and display the height, weight, BMI and status of each person and convert it from 1d array to 2d array
public class BMICalculator2DArray {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the number of persons by user
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        // Store weight, height, and BMI in 2d array
        // [0]: weight, [1]: height, [2]: BMI
        double[][] personData = new double[numberOfPersons][3]; 
        String[] weightStatus = new String[numberOfPersons];
        // Enter weight and height 
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            // Enter weight and ensure it's positive
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            // Enter height and ensure it's positive
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);
            // Calculate BMI 
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            // Find weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display the results
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] + " m, Weight = " + personData[i][0] + " kg, BMI = " + personData[i][2] + ", Status = "
        }
        // Close the scanner
        input.close();
    }
}
