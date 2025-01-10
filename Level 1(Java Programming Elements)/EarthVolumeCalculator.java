// Create EarthVolumeCalculator class to calculate volume of Earth in kilometers and miles
public class EarthVolumeCalculator{
   public static void main(String[]args){
      // Given Earth's radius in KM
      double radius = 6378;
      //Conversion rate of KM to Miles
      double kilometersToMilesConversion = 1.6;
      // Volume of Earth in KM
      double volumeKm = (4.0/3) * Math.PI * Math.pow(radius,3);
      // Volume of Earth in Miles 
      double volumeMile = volumeKm * Math.pow( kilometersToMilesConversion,3);
      // Display the Volume of Earth in KM and Miles
      System.out.println("The volume of earth in cubic kilometers is " + volumeKm +" and cubic miles is " + volumeMile);
   }
}
