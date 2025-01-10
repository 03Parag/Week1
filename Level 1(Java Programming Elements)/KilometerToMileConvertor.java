import java.util.Scanner;
// Create KilometerToMileConvertor class to convert distance from Km to Mile
public class KilometerToMileConvertor{
   public static void main(String[]args){
      // Create a variable km and assign type as double 
      double km;
      // Create Scanner Object to take user input
      Scanner input = new Scanner(System.in);
      // input the value in Km variable 
      System.out.print("Enter the distance in kilometers: ");
      km = input.nextDouble();
      // Conversion rate: 1 mile = 1.6 kilometers
      double mile = km / 1.6;
      // Print result
      System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
      // Close the scanner object
      input.close();
   }
} 