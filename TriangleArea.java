// Importing Scanner class for user input
import java.util.Scanner;

// Creating class TriangleArea 
class TriangleArea {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the base in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        // Asking user to enter the height in centimeters
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculating area of triangle in square cm
        double areaCm = 0.5 * base * height;

        // Converting the area into square inches
        double areaInch = areaCm * 0.155;

        // Displaying the results
        System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaInch + " square inches.");

    }
}
