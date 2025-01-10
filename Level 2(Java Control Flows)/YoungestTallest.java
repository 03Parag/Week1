import java.util.Scanner;
// Create a class YoungestTallest to find the youngest and tallest among friends
class YoungestTallest {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Input the age and height of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int amarHeight = sc.nextInt();
        // Input the age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarHeight = sc.nextInt();
        // Input the age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyHeight = sc.nextInt();
        // Determine the youngest friend based on age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngest = "";
        if (youngestAge == amarAge) {
            youngest = "Amar";
        } else if (youngestAge == akbarAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        // Determine the tallest friend based on height
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallest = "";
        if (tallestHeight == amarHeight) {
            tallest = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        // Display the results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + youngest + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight + " cm.");
        // Close the scanner
        sc.close();
    }
}
