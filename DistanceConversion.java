// Importing Scanner class for user input
import java.util.Scanner;  

// Creating class DistanceConversion indicating the purpose 
class DistanceConversion {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Asking user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        
        // Declaring variable km to store user input 
        double km = input.nextDouble();
        
        // Defining conversion factor from km to miles
        double conversionFactor = 1.6;
        
        // Calculating distance in miles
        double miles = km / conversionFactor;
        
        // Displaying the converted distance
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        
    }
}
