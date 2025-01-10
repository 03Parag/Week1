import java.util.Scanner;
// Create a class LeapYear to determine if a year is a leap year
class LeapYear {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Take the year as input from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();
        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // Approach 1: Using multiple if-else statements
            System.out.println("Approach 1: Using multiple if-else");
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
            // Approach 2: Using a single if statement with logical operators
            System.out.println("Approach 2: Using a single if statement");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        // Close the scanner
        sc.close();
    }
}
