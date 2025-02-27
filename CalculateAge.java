// Creating Class with name CalculateAge indicating the purpose is to calculate age.
class CalculateAge {

    public static void main(String[] args) {
        
        //Create an int variable birthYear and assign value 2000
        int birthYear = 2000;
        
        //Create an int variable currentYear and assign value 2024
        int currentYear = 2024;
        
        //Calculate age by subtracting birth year from current year
        int age = currentYear - birthYear;
        
        //Display the result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
