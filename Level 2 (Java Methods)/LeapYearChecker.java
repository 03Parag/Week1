import java.util.Scanner;
// Create LeapYearChecker to check if the given year is leap year or not
public class LeapYearChecker {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions
        return (year >= 1582 && (year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        // Determine if the year is a leap year
        boolean leapYear = isLeapYear(year);
        // Output the result
        if (leapYear) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
        // Close the scanner
        input.close();
    }
}
