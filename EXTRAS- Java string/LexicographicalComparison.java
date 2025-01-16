import java.util.Scanner;
// Create LexicographicalComparison class to compare two strings lexicographically (dictionary order) without using built-in compare methods.
public class LexicographicalComparison {
    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        // Compare each character of both strings
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            // Compare the characters
            if (c1 < c2) {
                // str1 comes before str2
                return -1; 
            } else if (c1 > c2) {
                // str1 comes after str2
                return 1; 
            }
        }
        // If the strings are identical up to the length of the shortest one
        // The shorter string is considered smaller
        if (str1.length() < str2.length()) {
            // str1 comes before str2
            return -1; 
        } else if (str1.length() > str2.length()) {
            // str1 comes after str2
            return 1; 
        }
        // Both strings are equal
        return 0; 
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter two strings 
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();        
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();        
        // Compare the strings lexicographically
        int result = compareStrings(str1, str2);        
        // Display the result based on the comparison
        if (result < 0) {
            System.out.println( str1 + " comes before " + str2 + " in lexicographical order");
        } else if (result > 0) {
            System.out.println( str1 + " comes after " + str2 + " in lexicographical order");
        } else {
            System.out.println( str1 + " is equal to " + str2 );
        }
        // Close the scanner
        input.close();
    }
}
