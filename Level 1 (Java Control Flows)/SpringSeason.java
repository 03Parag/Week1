import java.util.Scanner;
// Create SpringSeason class to check if the given date is in Spring season
public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Enter the month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();        
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();        
        // Check if the month and day fall within the Spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day <= 20)) {
            // If the date is between March 20 and June 20 (inclusive)
            System.out.println("It's a Spring Season");
        } else {
            // Otherwise, it's not a Spring season
            System.out.println("Not a Spring Season");
        }        
        // Close the scanner object
        input.close();
    }
}
