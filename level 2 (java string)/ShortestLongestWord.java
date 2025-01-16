import java.util.Scanner;
// Create ShortestLongestWord class to split the text into words and find the shortest and longest strings in a given text
public class ShortestLongestWord {
    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        int i = 0;
        // Count the number of words
        while (i < text.length()) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                wordCount++;
            }
            i++;
        }
        // Create an array to store words
        String[] words = new String[wordCount];
        String currentWord = "";
        int wordIndex = 0;
        i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                // Build current word
                currentWord += ch; 
            } else {
                // Store the word
                words[wordIndex] = currentWord; 
                wordIndex++;
                // Reset the word
                currentWord = ""; 
            }
            i++;
        }
        // Add the last word
        if (!currentWord.isEmpty()) {
            words[wordIndex] = currentWord;
        }
        return words;
    }
    // Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                // Try accessing characters
                str.charAt(length); 
                // Increment the length
                length++; 
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }
    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        int i = 0;
        while (i < words.length) {
            // Store the word
            wordLengthArray[i][0] = words[i]; 
            // Store length as String
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); 
            i++;
        }
        return wordLengthArray;
    }
    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";
        int i = 0;
        while (i < wordLengthArray.length) {
            // Convert length back to integer
            int length = Integer.parseInt(wordLengthArray[i][1]); 
            // Find the shortest length
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = wordLengthArray[i][0];
            }
            // Find the longest length
            if (length > longestLength) {
                longestLength = length;
                longestWord = wordLengthArray[i][0];
            }
            i++;
        }
        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
    }
    public static void main(String[] args) {
        // Create a scanner object  
        Scanner input = new Scanner(System.in);
        // Enter a sentence
        System.out.println("Enter a sentence:");
        String text = input.nextLine();
        // Split the text into words
        String[] words = splitTextIntoWords(text);
        // Create a 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);
        // Find the shortest and longest words
        String[] result = findShortestAndLongest(wordLengthArray);
        // Display the results
        System.out.println("\nShortest word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest word: " + result[2] + " (Length: " + result[3] + ")");
        // Close the scanner
        input.close();
    }
}
