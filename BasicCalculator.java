// Importing Scanner class for user input
import java.util.Scanner;

// Creating class BasicCalculator 
class BasicCalculator {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter first number
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        // Asking user to enter second number
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2; // Division is done directly

        // Displaying the results
        System.out.println("The addition, subtraction, multiplication and division value of " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        
    }
}
