import java.util.Scanner;
// Create YoungestTallestFriends class to find youngest and tallest one among friends
public class YoungestTallestFriends {
    public static void main(String[] args) {
        // Store ages and heights of the 3 friends by using arrays
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Enter age and height
        System.out.println("Enter the ages and heights of the 3 friends:");
        // Enter age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = input.nextInt();
            System.out.print(names[i] + " - Height in cm: ");
            heights[i] = input.nextDouble();
        }
        // Find the youngest and the tallest
        int youngestIndex = 0;
        double tallestIndex = 0;        
        // Find the youngest and tallest using loop
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        // Display the results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
        // Close the scanner
        input.close();
    }
}
