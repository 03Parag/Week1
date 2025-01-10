import java.util.Scanner;
// Create a class ArmstrongNumber to check if a number is an Armstrong number or not
class ArmstrongNumber {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Create a variable to store the original number
      int originalNumber = number;
      // Find the number of digits in the number
      int numberOfDigits = String.valueOf(number).length();
      // Create a variable to store the sum
      int sum = 0;
      // Use while loop to iterate through each digit of the number
      while (number != 0) {
         int digit = number % 10; // Get the last digit
         sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of number of digits to sum
         number /= 10; // Remove the last digit
      }
      // Check if the sum equals the original number
      if (sum == originalNumber) {
         System.out.println(originalNumber + " is an Armstrong number.");
      } else {
         System.out.println(originalNumber + " is not an Armstrong number.");
      }
      // Close the scanner object
      sc.close();
   }
}
