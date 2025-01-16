import java.util.Scanner;
// Create WordReplace class to replaces a given word with another word in a sentence
public class WordReplace {
    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Initialize an empty string
        String result = "";        
        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");        
        // Loop through each word in the sentence using a for loop
        for (int i = 0; i < words.length; i++) {
            // If the word matches the old word, replace it with the new word
            if (words[i].equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += words[i] + " ";
            }
        }        
        // Return the modified sentence after trimming the trailing space
        return result.trim();
    }
    public static void main(String[] args) {
        // Create a scanner object 
        Scanner input = new Scanner(System.in);        
        // Enter the sentence, old word, and new word 
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();        
        System.out.print("Enter the word to be replaced: ");
        String oldWord = input.nextLine();        
        System.out.print("Enter the new word to replace with: ");
        String newWord = input.nextLine();        
        // Call the replaceWord method and display the result
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);        
        // Close the scanner
        input.close();
    }
}
