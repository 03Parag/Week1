import java.util.Scanner;
// Create TotalPurchasePrice to calculate total price using quantity and unit price 
public class TotalPurchasePrice {
    public static void main(String[] args) {
        // Declare the variable unitPrice and quantity
        double unitPrice , quantity;   
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter the unit price of the item
        System.out.print("Enter the unit price of the item in INR: ");
        unitPrice = input.nextDouble();
        // Enter the quantity of the item
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();
        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;
        // Print the results
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice); 
        // Close the scanner object
        input.close();                         
    }
}
