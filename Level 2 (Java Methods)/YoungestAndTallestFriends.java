import java.util.Scanner;
// Create YoungestAndTallestFriends class to  to find the youngest and tallest of the 3 friend
public class YoungestAndTallestFriends {
    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int youngestAge = ages[0];
        String youngestName = names[0];
        // Find the minimum (youngest) using loop
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestName = names[i];
            }
        }
        return youngestName;
    }
    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double tallestHeight = heights[0];
        String tallestName = names[0];
        // Find the maximum (tallest) using loop
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestName = names[i];
            }
        }
        return tallestName;
    }
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Names of the 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};        
        // Store ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Enter ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height (in meters) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
        // Find and display the youngest friend
        String youngestFriend = findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngestFriend);
        // Find and display the tallest friend
        String tallestFriend = findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallestFriend);
        // Close the scanner
        input.close();
    }
}
