// Create PenDistribution class to help distribute pen among students
public class PenDistribution{
    public static void main(String[]args){
       // Given number of pens and student
       int pen = 14, student = 3;
       // Find pen per student and remaining pen
       int penPerStudent = pen / student;
       int remainingPen = pen % student;
       // Display result
       System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
    }
}