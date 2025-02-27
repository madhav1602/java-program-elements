// Importing Scanner class for user input
import java.util.Scanner;

// Class to convert distance from feet to yards and miles
class FeetToYard {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3; 
        double distanceInMiles = distanceInYards / 1760; 

        // Displaying the result
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);

       
    }
}
