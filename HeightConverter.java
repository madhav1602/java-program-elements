// Importing Scanner class for user input
import java.util.Scanner;

// Creating class HeightConverter 
class HeightConverter {
    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Converting height from cm to inches
        double heightInches = heightCm / 2.54;

        // Converting inches to feet and remaining inches
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        // Displaying height in cm, feet, and inches
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + inches);

       
    }
}
