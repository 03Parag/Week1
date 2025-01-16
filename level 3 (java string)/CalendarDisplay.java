import java.util.Scanner;
// Create CalendarDisplay class to display a calendar for a given month and year
public class CalendarDisplay {
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};                               
        return months[month - 1];
    }
    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};                     
        // If it's February, check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
    // Method to get the first day of the month using the Gregorian algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        // Adjust month and year for January and February
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }
        // Calculate using the Gregorian formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // 1 is the day of the month
        int d0 = (1 + x + (31 * m0) / 12) % 7;  
        // Return the first day of the month (0=Sunday, 6=Saturday)
        return d0;  
    }
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        // Display the month and year
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            // 4 spaces
            System.out.print("    "); 
        }
        // Print the days of the month
        int day = 1;
        for (int i = firstDay; day <= daysInMonth; i++) {
            System.out.printf("%3d ", day);
            if (++i > 6) {
                // Reset to Sunday
                i = 0; 
                System.out.println();
            }
            day++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Enter month and year
        System.out.println("Enter the month (1-12):");
        int month = input.nextInt();
        System.out.println("Enter the year:");
        int year = input.nextInt();
        // Display the calendar 
        displayCalendar(month, year);
        // Close the scanner
        input.close();
    }
}
