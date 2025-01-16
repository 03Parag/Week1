import java.util.Scanner;
// Create SubstringCount class to count how many times a given substring occurs in a string.
public class SubstringCount {
    // Method to count occurrences of a substring
    public static int countSubstringOccurrences(String str, String substring) {
        // Initialize the count and index 
        int count = 0;
        int index = 0;
        // Loop through the string and find all occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            // Move index forward to avoid counting the same occurrence
            index += substring.length(); 
        }
        return count;
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the string and the substring 
        System.out.print("Enter the main string: ");
        String str = input.nextLine();
        System.out.print("Enter the substring: ");
        String substring = input.nextLine();
        // Call the method to count the occurrences of the substring
        int result = countSubstringOccurrences(str, substring);
        // Display the result
        System.out.println("The substring " + substring + " occurs " + result + " times in the string.");
        // Close the scanner
        input.close();
    }
}
