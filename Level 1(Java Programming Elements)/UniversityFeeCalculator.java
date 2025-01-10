import java.util.Scanner;
// Create UniversityFeeCalculator to calculate the discount and the discount percent 
public class UniversityFeeCalculator {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);
      // Declare variables for fee and discount percentage
      double fee, discountPercent;
      // Enter the fee and discount percentage
      System.out.print("Enter the student fee in INR: ");
      fee = input.nextDouble();
      System.out.print("Enter the university discount percentage: ");
      discountPercent = input.nextDouble();
      // Calculate the discount amount
      double discount = fee * discountPercent / 100;
      // Calculate the final discounted fee
      double discountedFee = fee - discount;
      // Print the results
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);                     
      // Close the scanner object
      input.close();
   }
}
