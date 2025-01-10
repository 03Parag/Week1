import java.util.Scanner;
// Create BonusCalculator class to calculate bonus based on years of service
public class BonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Declare variables for salary and years of service
        double salary;
        int yearsOfService;
        // Take user input for salary and years of service
        System.out.print("Enter the salary of the employee: ");
        salary = input.nextDouble();        
        System.out.print("Enter the years of service of the employee: ");
        yearsOfService = input.nextInt();
        // Initialize bonus variable
        double bonus = 0.0;
        // Check if the employee has more than 5 years of service
        if (yearsOfService > 5) {
            // Calculate bonus as 5% of the salary
            bonus = salary * 0.05;
            System.out.println("The employee is eligible for a bonus of INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        // Close the scanner object
        input.close();
    }
}
