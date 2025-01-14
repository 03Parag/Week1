import java.util.Scanner;
// Create CompareString class to compare the result of two string using charAt() and built-in string method equals()
public class CompareString {
    // Method to compare 2 string using charAt method
    public static boolean compareStringUsingCharAt(String string1, String string2){
        // If lengths are not same, strings are not same
        if (string1.length() != string2.length()) {
            return false;
        }
        // If characters are not same, strings are not same 
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        // Both string are equal
        return true;
    } 
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter value in the string 1 and string 2
        System.out.print("Enter first string: ");
        String string1 = input.next();
        System.out.print("Enter second string: ");
        String string2 = input.next();
        // Compare using charAt() method  
        boolean resultCharAt = compareStringUsingCharAt(string1, string2);
        // Compare using equals() method
        boolean resultEquals = string1.equals(string2);
        // Display the results
        System.out.println("Result using charAt() method: " + resultCharAt); 
        System.out.println("Result using equals() method: " + resultEquals);
        // Check if results of both methods are the same
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The methods produce different results.");
        }
        // Close the scanner
        input.close();
    }
}
   