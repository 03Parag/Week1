import java.util.Scanner;
// Create EmployeeBonus class 
public class EmployeeBonus {
    public static void main(String[] args) {
        // Initialize arrays to store data for 10 employees
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        // Initialize variables to calculate total bonus, old salary, and new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        // Create Scanner object 
        Scanner input = new Scanner(System.in);
        // Loop to take data for 10 employees
        for (int i = 0; i < 10; i++) {
            // Enter salary and years of service 
            while (true) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble();
                System.out.print("Enter years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter again.");  
                }
            }
        }
        // Calculate bonus and new salary using loop
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) { 
                // 5% bonus
                bonus[i] = salary[i] * 0.05;  
            } else {
                // 2% bonus
                bonus[i] = salary[i] * 0.02;  
            }
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];
            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        // Print total bonus payout and salary details
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        // Close the scanner
        input.close();
    }
}
