// Importing Scanner class for user input
import java.util.Scanner;

// Creating class PurchaseCalculator
class PurchaseCalculator {

   public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Asking user to enter quantity
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying the result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and the unit price is INR " + unitPrice);

       
    }
}
