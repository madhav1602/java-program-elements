// Creating class ConvertDistance to indicate its purpose 
class ConvertDistance {

    public static void main(String[] args) {

        // Define the distance in kilometers
        double distanceKilometer = 10.8;
        
        // Conversion factor
        double kilometerToMiles = 1.6;
        
        // Convert kilometers to miles
        double distanceMiles = distanceKilometer / kilometerToMiles;
        
        // Display the result
        System.out.println("The distance " + distanceKilometer + " km in miles is " + distanceMiles);
    }
}
