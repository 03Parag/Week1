import java.util.Scanner;
// Create VoteEligibility class to check if a person can vote based on their age
public class VoteEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);        
        // Enter the age of the person
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();        
        // Check if the person's age is 18 or older
        if (age >= 18) {
            // If the age is 18 or older, the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the age is less than 18, the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }       
        // Close the scanner object
        input.close();
    }
}
