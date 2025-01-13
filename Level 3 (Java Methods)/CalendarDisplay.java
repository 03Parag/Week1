import java.util.Scanner;
// Create CalendarDisplay class to show the month and year 
public class CalendarDisplay {
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        // Adjust because months array is 0-indexed
        return months[month - 1]; 
    }
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, except for years divisible by 100, unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        // Number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Adjust February for leap years
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1]; // Adjust for 0-indexed array
    }
    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Apply the Gregorian calendar formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get month name and number of days
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        // Display month and year
        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces
        }
        // Print days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day);
            day++;
        }
        System.out.println();
        // Print remaining weeks of the month
        for (int i = 2; day <= daysInMonth; i++) {
            for (int j = 0; j < 7 && day <= daysInMonth; j++) {
                System.out.printf("%3d ", day);
                day++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Enter month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();        
        // Display the calendar
        displayCalendar(month, year);
        // Close scanner
        scanner.close();
    }
}
