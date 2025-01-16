import java.util.Scanner;
// Create WordLength class to split the text into words and return length using 2D array
public class WordLength {
    // Method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        // Initialize the count and a string called word
        String word = "";
        int count = 0;
        // Counting the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                count++;
            }
        }
        String[] words = new String[count];
        int j = 0;
        // Splitting the text into words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[j] = word;
                j++;
                word = "";
            }
        }
        // Adding the last word
        words[j] = word;
        return words;
    }
    // Method to find the length of a string
    public static int getStringLength(String str) {
        int length = 0;
        char[] charArray = str.toCharArray(); // Convert the string to a char array
        for (int i = 0; i < charArray.length; i++) {
            length++;
        }
        return length;
    }
    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordsAndLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return wordsAndLengths;
    }
    // Method to display the result in a tabular format
    public static void displayResult(String[][] wordsAndLengths) {
        System.out.printf("%-10s %-10s%n", "Word", "Length");
        for (int i = 0; i < wordsAndLengths.length; i++) {
            System.out.printf("%-10s %-10d%n", wordsAndLengths[i][0], Integer.parseInt(wordsAndLengths[i][1]));
        }
    }
    public static void main(String[] args) {
        // Create the scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scanner.nextLine();
        // Splitting the text into words
        String[] words = splitTextIntoWords(input);        
        // Finding lengths of words
        String[][] wordsAndLengths = getWordsAndLengths(words);
        // Displaying the result in a tabular format
        displayResult(wordsAndLengths);
        // Close the scanner
        scanner.close();
    }
}

