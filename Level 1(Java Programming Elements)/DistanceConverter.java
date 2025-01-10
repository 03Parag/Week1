// Create DistanceConverter class to convert kilometers into miles
public class DistanceConverter{
   public static void main(String[]args){
      // Distance in kilometers
      double kilometer = 10.8;
      // Conversion rate: 1 km = 1.6 mile
      double rate = 1.6;
      double mile = kilometer * rate;
      // Display Result
      System.out.println("The distance " + kilometer + " km in miles is " + mile);
   }
} 