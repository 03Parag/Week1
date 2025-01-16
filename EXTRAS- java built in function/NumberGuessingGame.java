import java.util.Random;
import java.util.Scanner;
// Create NumberGuessingGame to guess the correct number and give feedback
public class NumberGuessingGame {
    // Function to generate a random guess within the range of 1 to 100
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
    // Function to get user feedback
    public static String getFeedback(int guess, Scanner input) {
        System.out.print("Is the guess " + guess + "? (Enter 'high' if the guess is too high, 'low' if it's too low, 'correct' if it's correct): ");
        return input.nextLine().toLowerCase();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");
        System.out.println("Please provide feedback after each guess.");
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;
        // Loop until the computer guesses the number correctly
        do {
            // Generate a random guess
            guess = generateGuess(lowerBound, upperBound);
            feedback = getFeedback(guess, input);  // Get the user's feedback
            // Adjust the bounds based on user feedback
            if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            }
        } while (!feedback.equals("correct"));
        // If the guess is correct, print a success message
        System.out.println("I guessed your number correctly! It was " + guess + ".");
        input.close();
    }
}
