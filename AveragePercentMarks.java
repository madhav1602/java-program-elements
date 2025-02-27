//Creating a class with name AveragePercentMarks indicating the purpose is to find Average percentage marks

public class AveragePercentMarks{
	public static void main(String[] args){
		
		//Creating an int variable for marks of maths
		int mathMarks = 94;

		//Creating an int variable for marks of physics
		int physicsMarks = 95;

		//Creating an int variable for marks of chemistry
		int chemistryMarks = 96;

		//Creating an int variable to store average percent marks
		int averageMarks= (mathMarks + physicsMarks + chemistryMarks)/3;

		//Display the result
		System.out.print("Sam's Average marks in PCM is: " + averageMarks);
	}
}
