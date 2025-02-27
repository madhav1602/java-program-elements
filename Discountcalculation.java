// Importing Scanner class for user input
import java.util.Scanner;

// Creating class DiscountCalculation 
class Discountcalculation {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input for the course fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Taking input for the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating the discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculating the final fee 
        double finalFee = fee - discountAmount;

        // Displaying the discount amount and final payable fee
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);

    }
}
