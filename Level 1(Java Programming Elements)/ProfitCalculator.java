// Create ProfitCalculator class to calculate profit and profit percentage
public class ProfitCalculator{
    public static void main(String[]args){
        //  Given Cost and selling price in INR
        double costPrice = 129.0, sellingPrice = 191.0;
        //  Find Profit and profit percentage 
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice)*100;
        // Display Result
        System.out.println("The Cost Price is INR " + costPrice + "and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage );
     }
}
