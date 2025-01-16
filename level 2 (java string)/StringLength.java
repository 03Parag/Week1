import java.util.Scanner;
// Create StringLength class to find the length of the string without using length() method
public class StringLength {
    // Method to find and return a string's length without using the built-in length() method
    public static int findLength(String str){
        // Initialize the count
         int count =0;
        try { 
            // Loop till exception occurs
            while (true){
                // Try to get all characters
                str.charAt ( count );
                // Increase the count by one
                count++;
            }
        } catch ( IndexOutOfBoundsException e){
            // Handle the exception 
            System.out.println("Find an IndexOutOfBoundsException: " + e.getMessage());
        }
        // Return the total count  
        return count;
    }
    public static void main(String [] args){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the text: "); 
        // Enter the text
        String text = input.next();
        // Call the method using the user method
        int userLength = findLength( text);
        // Call the method using the length() method
        int builtInLength = text.length();
        // Display the results
        System.out.println(" Using the user length, the length of the string: " + userLength);
        System.out.println(" Using the builtIn length, the length of the string: " + builtInLength); 
        // Close the scanner 
        input.close();
    }       
}
 