// Importing Scanner class for user input
import java.util.Scanner;

// Class to calculate quotient and remainder
class DivisionCalculator {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Asking user to enter second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Checking if the divisor is zero to prevent division by zero error
        if (number2 == 0) {

            System.out.println("Division by zero is not allowed.");

        } else {

            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Displaying the result
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                               " of two numbers " + number1 + " and " + number2);
        }

 
    }
}
