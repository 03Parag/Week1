import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Create DateManipulation class to manipulate the date
public class DateManipulation {
    // Method to take date input from the user in dd-MM-yyyy format
    public static String getInputDate(String input) {
        return input;
    }
    // Method to convert the date string to LocalDate
    public static LocalDate parseDate(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(inputDate, formatter);
    }
    // Method to display the final result
    public static void displayResult(LocalDate resultDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Final date after modifications: " + resultDate.format(formatter));
    }
    public static void main(String[] args) {
        // Accept the date input directly (no Scanner used here)
        String inputDate = "15-01-2025";  
        // Parse the input date
        LocalDate parsedDate = parseDate(getInputDate(inputDate));
        // Add 7 days, 1 month, and 2 years to the parsed date
        LocalDate resultDate = parsedDate.plusDays(7).plusMonths(1).plusYears(2);
        // Subtract 3 weeks from the result date
        resultDate = resultDate.minusWeeks(3);
        // Display the final result
        displayResult(resultDate);
    }
}
