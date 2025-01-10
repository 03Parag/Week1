import java.util.Scanner;
// Create a class LeapYear_1 to determine if a year is a leap year
class LeapYear_1 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Take the user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        // Ensure the year is within the Gregorian calendar range
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // Check if the year is a leap year using a single if condition
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        // Close the scanner object
        sc.close();
    }
}
