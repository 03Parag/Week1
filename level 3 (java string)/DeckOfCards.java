import java.util.Random;
import java.util.Scanner;
// Create a deck of cards, shuffle the deck, and distribute it to players
public class DeckOfCards {
    // Class-level constants
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static final int NUM_OF_CARDS = SUITS.length * RANKS.length;
    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] deck = new String[NUM_OF_CARDS];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] playerHands = new String[players][cardsPerPlayer];
        int deckIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerHands[i][j] = deck[deckIndex++];
            }
        }
        return playerHands;
    }
    // Method to print the players' cards
    public static void printPlayerHands(String[][] playerHands) {
        for (int i = 0; i < playerHands.length; i++) {
            System.out.println("Player " + (i + 1) + "'s hand:");
            for (int j = 0; j < playerHands[i].length; j++) {
                System.out.println("  " + playerHands[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Initialize the deck
        String[] deck = initializeDeck();
        // Shuffle the deck
        shuffleDeck(deck);
        // Enter the number of players and number of cards per player
        System.out.print("Enter the number of players: ");
        int players = input.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        // Distribute the cards to the players
        if (cardsPerPlayer * players <= NUM_OF_CARDS) {
            String[][] playerHands = distributeCards(deck, players, cardsPerPlayer);
            // Print the players' cards
            printPlayerHands(playerHands);
        } else {
            System.out.println("Not enough cards for the given number of players and cards per player.");
        }
        // Close the scanner
        input.close();
    }
}
