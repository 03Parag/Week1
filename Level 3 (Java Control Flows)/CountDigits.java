import java.util.Scanner;
// Create a class CountDigits to count the number of digits in a number
class CountDigits {
   public static void main(String[] args) {
      // Create a scanner object to take user input
      Scanner sc = new Scanner(System.in);
      // Take user input for the number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      // Handle the case for zero directly
      if (number == 0) {
         System.out.println("The number of digits is: 1");
         return;
      }
      // Create a variable to count the digits
      int count = 0;      
      // Use a loop to count the digits
      while (number != 0) {
         // Remove the last digit
         number /= 10; 
         // Increment count for each digit
         count++; 
      }
      // Display the count of digits
      System.out.println("The number of digits is: " + count);      
      // Close the scanner
      sc.close();
   }
}
