// Importing Scanner class for user input
import java.util.Scanner;

// Creating class SquareSide 
class SquareSide {
    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculating the side of the square
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        
    }
}
