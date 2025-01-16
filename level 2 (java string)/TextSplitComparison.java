import java.util.Scanner;
// Create TextSplitComparison class to split the text into words using the user defined method and then using split() method and then compare
public class TextSplitComparison {
    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String str) {
        // Initialize the length
        int length = 0;
        try {
            while (true) {
                // Try accessing characters
                str.charAt(length); 
                // Increment length by one
                length++; 
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Find an IndexOutOfBoundsException: " + e.getMessage());
        }
        // Return the total length 
        return length;
    }
    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Find the length of the text
        int length = findLength(text); 
        // Initialize the count
        int wordCount = 0;
        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                // Increment the word count by one
                wordCount++;
            }
        }
        // Store the index of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        // Initialize the index
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        // Store the words
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            words[wordIndex++] = text.substring(start, end);
            start = end + 1;
        }
        // Add the last word
        words[wordIndex] = text.substring(start);
        return words;
    }
    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            // Arrays have different lengths
            return false; 
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                // Mismatch found
                return false; 
            }
        }
        // Arrays are identical 
        return true;
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the sentence
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();
        // Use user-defined split method
        String[] userSplitWords = splitTextIntoWords(text);
        // Use built-in split method
        String[] builtInSplitWords = text.split(" ");
        // Compare the results
        boolean areIdentical = compareStringArrays(userSplitWords, builtInSplitWords);
        // Display the results
        System.out.println("Words using user-defined split method:");
        for (int i = 0; i < userSplitWords.length; i++) {
            System.out.println(userSplitWords[i]);
        }
        System.out.println("Words using built-in split() method:");
        for (int i = 0; i < builtInSplitWords.length; i++) {
            System.out.println(builtInSplitWords[i]);
        }
        // If the string arrays are identical print yes else no
        if (areIdentical) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Close the scanner
        input.close();
    }
}
