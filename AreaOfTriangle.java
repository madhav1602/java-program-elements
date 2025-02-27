// Import Scanner class for user input
import java.util.Scanner;

// Class to calculate the area of a triangle
class AreaOfTriangle {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter base and height in cm
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculating area in square centimeters
        double areaCm = 0.5 * base * height;

        // Converting area to square inches (1 inch = 2.54 cm, so 1 sq in = 2.54^2 sq cm)
        double areaInches = areaCm / (2.54 * 2.54);

        // Displaying the results
        System.out.println("The Area of the triangle in square centimeters is " + areaCm);
        System.out.println("The Area of the triangle in square inches is " + areaInches);

        
    }
}
