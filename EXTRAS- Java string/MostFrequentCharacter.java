import java.util.Scanner;
// Create MostFrequentCharacter class to find the most frequent character in a string
public class MostFrequentCharacter {
    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();        
        // Store the most frequent character
        char mostFrequentChar = chars[0];
        int maxCount = 0;
        // Loop over each character in the string
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int count = 1;
            // Compare with other characters to count the frequency of the current character
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    count++;
                    // Mark the character as visited by replacing it with a non-alphabet character (for example, space)
                    chars[j] = ' ';
                }
            }
            // If the count of the current character is greater than the current max count, update the most frequent character
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }
        // Return the most frequent character
        return mostFrequentChar;
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);   
        // Enter the string 
        System.out.print("Enter a string: ");
        String str = input.nextLine();        
        // Find and display the most frequent character
        char result = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + result + "'");        
        // Close the scanner
        input.close();
    }
}
