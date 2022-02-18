package class04_IfElseSwitch_Example;

public class QuizSeven {

	public static void main(String[] args) {
		int dayValue;
		dayValue = 3;
		switch (dayValue) {
		case 1: System.out.println("Monday");
		case 2: System.out.println("tuesday");
		case 3: System.out.println("wednesday");
		case 4: System.out.println("thurday");
		case 5: System.out.println("Friday");
		case 6: System.out.println("Saturday");
		case 7: System.out.println("Sunday");
		default:
			System.out.println("Invalid day");
		}//switch
		
	}

}
