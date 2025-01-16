import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
// Create DateComparison class to compares them to check if the first date is before, after, or the same as the second date
public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the first date 
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String inputDate1 = input.nextLine();       
        // Enter the second date 
        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String inputDate2 = input.nextLine();
        // Close the scanner
        input.close();
        // Define the date format to be used for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Parse the dates to LocalDate objects
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);
        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
