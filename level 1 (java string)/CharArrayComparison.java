import java.util.Scanner;
// Create CharArrayComparison class to compare two arrays. One created using charAt method and other using ToCharArray() method 
public class CharArrayComparison {
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    // Method to compare two character arrays 
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // If lengths are different, arrays are not equal
        if (array1.length != array2.length) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }        
        // Both arrays are equal
        return true;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter the string
        System.out.print("Enter the string: ");
        String str = input.next();
        // Get the array using the user-defined method
        char[] userCharArray = getCharacters(str);
        // Get the  array using the built-in toCharArray() method
        char[] builtInCharArray = str.toCharArray();
        // Compare the character arrays
        boolean comparisonResult = compareCharArrays(userCharArray, builtInCharArray);
        // Display the results
        System.out.println("Character array using user method: ");
        for (int i = 0; i < userCharArray.length; i++) {
            System.out.print(userCharArray[i] + " ");
        }
        System.out.println("Character array using built-in toCharArray() method: ");
        for (int i = 0; i < builtInCharArray.length; i++) {
            System.out.print(builtInCharArray[i] + " ");
        }
        System.out.println("Are both character arrays equal? " + comparisonResult);
        // Close the scanner
        input.close();
    }
}
