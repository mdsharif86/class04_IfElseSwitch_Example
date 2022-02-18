package class04_IfElseSwitch_Example;

public class QuizTwetyFour {
		
	public static void main(String[] args) {
		
	
		String Department ="cse";

		int year = 2;
		
		switch (year) {
		case 1:
		System.out.println("elective courses : Advance english, Algebra");
		break;
		case 2:
			switch (Department) // nested switch
			{
			case "CSE":
			case "CCE":
			System.out.println("elective courses : Machine Learning, Big Data");
			break;
			case "ECE":
			System.out.println("elective courses : Antenna Engineering");
			break;
			default:
			System.out.println("Elective courses : Optimization");
			}//switch
		}//switch
	}//main

}//class
