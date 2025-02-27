// Creating class VolumeEarth
class volumeEarth {

    public static void main(String[] args) {

        // Define the radius of Earth in kilometers
        double radiusKm = 6378;

        // Define the conversion factor
        double kmToMilesConversion = 0.621371;

        // Compute the volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Compute the volume of Earth in cubic miles
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesConversion, 3);

        // Display the results
        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 +
            " and in cubic miles is " + volumeMiles3
        );
    }
}
