// Importing Scanner class for user input
import java.util.Scanner;

// Creating class BasicCalculator
class BasicCalculator {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        // Asking user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division;

        // Checking for division by zero to prevent errors
        if (number2 == 0) {
            division = Double.POSITIVE_INFINITY; // Handling division by zero
        } else {
            division = number1 / number2;
        }

        // Displaying the results of all operations in a single print statement
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " 
                + multiplication + ", and " + division);

        
    }
}
