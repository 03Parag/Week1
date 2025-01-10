import java.util.Scanner;
// Create BMI_Calculator to find the BMI 
class BMI_Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Declare variables for weight (kg) and height (cm)
        double weight, height;
        // Take input for weight in kilograms
        System.out.print("Enter your weight in kg: ");
        weight = sc.nextDouble();
        // Take input for height in centimeters
        System.out.print("Enter your height in cm: ");
        height = sc.nextDouble();
        // Convert height from cm to meters
        height = height / 100;
        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);
        // Display the calculated BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);
        // Determine the weight status based on BMI value
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 29.9) { // Updated the range for overweight
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
        // Close the scanner object
        sc.close();
    }
}
