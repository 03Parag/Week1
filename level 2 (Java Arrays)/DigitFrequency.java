import java.util.Scanner;
// Create DigitFrequency class to find the frequency of each digit in the number using an array and display the frequency of each digit
public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);        
        // Enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();        
        // Initialize index and store the digits in an array
        int[] digits = new int[10];
        int index = 0;        
        // Store the number in temp 
        int temp = number;
        // loop and store digit in an array
        while (temp > 0) {
            // Extract the last digit
            digits[index] = temp % 10;
            // Remove the last digit
            temp /= 10;            
            // Increment the frequency of the digit
            index++;
        }        
        // Initialize a frequency array of size 10
        int[] frequency = new int[10];        
        // Loop by the digits array and increment frequency of each digit
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }        
        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }        
        // Close the Scanner
        input.close();
    }
}
