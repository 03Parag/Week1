import java.util.Scanner;
// Create SimpleInterestCalculator class to calculate the simple interest given principle, rate and time as parameters
public class SimpleInterestCalculator {
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);
        // Enter Principal, Rate, and Time by user
        System.out.print("Enter the Principal amount: ");
        // Enter principal
        double principal = input.nextDouble();  
        System.out.print("Enter the Rate of Interest: ");
        // Enter rate
        double rate = input.nextDouble();  
        System.out.print("Enter the Time period: ");
        // Enter time
        double time = input.nextDouble();  
        // Calculating the simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time + ".");
        // Closie the scanner
        input.close();
    }
}
