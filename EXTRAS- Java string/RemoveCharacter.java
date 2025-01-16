import java.util.Scanner;
// Create RemoveCharacter class to remove all occurrences of a specific character from a string.
public class RemoveCharacter {    
    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char ch) {
        // Initialize an empty string
        String result = "";        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // If the current character is not the one to remove, add it to the result
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }        
        // Return the modified string
        return result;
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);        
        // Enter the string and character to remove 
        System.out.print("Enter a string: ");
        String str = input.nextLine();        
        System.out.print("Enter the character to remove: ");
        char ch = input.next().charAt(0);        
        // Call the removeCharacter method and display the result
        String modifiedString = removeCharacter(str, ch);
        System.out.println("Modified String: " + modifiedString);        
        // Close the scanner
        input.close();
    }
}
