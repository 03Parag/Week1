import java.util.Random;
// Create FootballTeamHeights class to find the sum, mean, shoertest and tallest height
public class FootballTeamHeights {
    // Method to create an array of random heights between 150 and 250
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        // Create random heights between 150 and 250 cm (inclusive)
        for (int i = 0; i < size; i++) {
            // 150 + random number between 0 and 100
            heights[i] = 150 + rand.nextInt(101); 
        }
        return heights;
    }
    // Method to find the sum of all heights
    public static int findSumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    // Method to find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSumOfHeights(heights);
        return (double) sum / heights.length;
    }
    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        // Generate random heights for 11 players
        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);
        // Find sum, mean, shortest and tallest height
        int sumOfHeights = findSumOfHeights(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        // Display the results
        System.out.print("Heights of the players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        System.out.println("Sum of heights: " + sumOfHeights);
        System.out.println("Mean height: " + meanHeight);
        System.out.println("Shortest height: " + shortestHeight);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
