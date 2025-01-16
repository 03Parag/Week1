import java.util.Scanner;
// Create ToggleCase class to toggle the case of each character in a given string.
public class ToggleCase {
    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        // Initialize an empty string to store the result
        String result = "";         
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);            
            // Toggle case: If it's lowercase, convert to uppercase, and vice versa
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                // For non-alphabetic characters, leave unchanged
                result += c; 
            }
        }        
        return result;
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);        
        // Enter the string 
        System.out.print("Enter a string: ");
        String str = input.nextLine();        
        // Call the method to toggle the case of characters in the string
        String toggledString = toggleCase(str);        
        // Display the result
        System.out.println("Toggled case string: " + toggledString);        
        // Close the scanner
        input.close();
    }
}
