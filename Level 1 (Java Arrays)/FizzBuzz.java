import java.util.Scanner;
// Create FizzBuzz class to print Fizz for multiplier of 3 , Buzz for multiplier of 5, FizzBuzz for multiplier of 5 and 2 
public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);        
        // Enter the number
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();        
        // Check if it is a positive integer
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array to store the results
            // We need an extra space to handle index from 0 to num
            String[] results = new String[num + 1];             
            // Loop it from 0 to the number
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = Integer.toString(i);
                }
            }            
            // Display the results
            for (int i = 1; i <= num; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }        
        // Close the scanner
        scanner.close();
    }
}
