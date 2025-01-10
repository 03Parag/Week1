// Create DiscountCalculator class to calculate discount in university fees
public class DiscountCalculator{
    public static void main(String[]args){
       // Given university fees
       int fee = 125000;
       // Given discount percent
       int discountPercent = 10;
       // Find discount 
       int discount = fee * discountPercent / 100;
       // Calculate the discounted  university fees
       int discountedFee = fee - discount;
       // Display result
       System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee );
    }
}