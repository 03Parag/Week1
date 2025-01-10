import java.util.Scanner;
// Create a class MultiplesBelow100 to find all multiples of a number below 100
class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Print the multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");
        // Loop backward from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the given number
            if (i % number == 0) {
                // Print the multiple if divisible
                System.out.println(i);
            }
        }
        // Close the scanner
        sc.close();
    }
}
