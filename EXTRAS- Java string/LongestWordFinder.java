import java.util.Scanner;
// Create LongestWordFinder class to find the longest word in a sentence
public class LongestWordFinder {
    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        String longestWord = "";
        // Loop through each word
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Enter the sentence 
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);
        // Display the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);
        // Close the scanner
        input.close();
    }
}
