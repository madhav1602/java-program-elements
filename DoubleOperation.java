// Importing Scanner class for user input
import java.util.Scanner;

// Creating class DoubleOperation
class DoubleOperation {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter three double values
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Performing double operations considering operator precedence
        double result1 = a + b * c;  
        double result2 = a * b + c;  
        double result3 = c + a / b;  
        double result4 = a % b + c;  

        // Displaying the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        
    }
}
