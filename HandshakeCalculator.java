// Importing Scanner class for user input
import java.util.Scanner;

// Creating class HandshakeCalculator
class HandshakeCalculator {

    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating maximum handshakes 
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);

        
    }
}
