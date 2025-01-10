// Create SamAverage class to display the sam's average percent mark in PCM
public class SamAverage{
   public static void main(String[]args){
      // Given Marks of each subject
      int maths = 94, physics = 95, chemistry = 96;
      // Find Average
      double average = (maths + physics + chemistry)/3.0;
      // Display Result
      System.out.println("Sam’s average mark in PCM is " + average);
   }
}