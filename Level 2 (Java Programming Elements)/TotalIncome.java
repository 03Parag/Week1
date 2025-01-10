import java.util.Scanner;
// Create TotalIncome to compute salary and bonus
public class TotalIncome {
    public static void main(String[] args) {
        // Declare variables for salary and bonus
        double salary, bonus;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the salary and bonus
        System.out.print("Enter the salary in INR: ");
        salary = input.nextDouble();
        System.out.print("Enter the bonus in INR: ");
        bonus = input.nextDouble();
        // Compute the total income by adding salary and bonus
        double totalIncome = salary + bonus;
        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        // Close the scanner object
        input.close();
    }
}
