// Importing Scanner class for user input
import java.util.Scanner;

// Creating class DistanceConverter
class DistanceConverter {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Displaying the results
        System.out.println("The distance in feet is " + distanceInFeet + " ft.");
        System.out.println("The equivalent distance in yards is " + distanceInYards + " yards.");
        System.out.println("The equivalent distance in miles is " + distanceInMiles + " miles.");

        
    }
}
