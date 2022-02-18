package class04_IfElseSwitch_Example;

public class QuizTwetyThree {

	public static void main(String[] args) {
		int number = 2;
		String day;
		
		switch(number) {
		//multiple cases without break statements
		case 1: System.out.println("Monday");
		case 2: System.out.println("Tuesday");
		case 3: System.out.println("Wednesday");
		case 4: System.out.println("Thursday");
		case 5: System.out.println("Friday");
			day ="Weekday";
			break;
		case 6: System.out.println("Saturday");
		case 7: System.out.println("Sunday");
		day = "Weekend";
		break;
		default:
			day = "Invalid day";
		}//switch
	}//main

}//class
