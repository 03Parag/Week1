import java.util.Random;
// Create EmployeeBonusCalculator to find the bonus and new salary
public class EmployeeBonusCalculator {
    // Method to generate the salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employeeData = new int[numEmployees][2];
        Random random = new Random();
        for (int i = 0; i < numEmployees; i++) {
            // Generate a random 5-digit salary (between 10000 and 99999)
            employeeData[i][0] = 10000 + random.nextInt(90000);   
            // Generate random years of service (between 1 and 10)
            employeeData[i][1] = 1 + random.nextInt(10);
        }   
        return employeeData;
    }
    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] newSalaryAndBonus = new double[numEmployees][2];        
        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];            
            // Calculate the bonus percentage
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;            
            // Calculate the bonus amount and new salary
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;            
            // Save the new salary and bonus in the array
            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;
        }        
        return newSalaryAndBonus;
    }
    // Method to calculate and display the total amounts and display the tabular data
    public static void displayEmployeeBonusData(int[][] employeeData, double[][] newSalaryAndBonus) {
        int numEmployees = employeeData.length;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        // Header for the tabular format
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------------");        
        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = newSalaryAndBonus[i][1];
            double newSalary = newSalaryAndBonus[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            // Display the employee data in tabular format
            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, bonus, newSalary);
        }
        // Display the total amounts
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        // Generate the employee data (old salary and years of service)
        int[][] employeeData = generateEmployeeData(numEmployees);
        // Calculate the new salary and bonus
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(employeeData);
        // Display the tabular data and totals
        displayEmployeeBonusData(employeeData, newSalaryAndBonus);
    }
}

