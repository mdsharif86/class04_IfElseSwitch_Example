package class04_IfElseSwitch_Example;

public class QuizTwetyOne {

	public static void main(String[] args) {
		int number = 3;
		String day;
		switch (number) {
		case 1:
		day = "Monday";
		case 2:
		day = "Tuesday";
		case 3:
		day = "Wednesday";
		case 4:
		day = "Thursday";
		case 5:
		day = "Friday";
		case 6:
		day = "Saturday";
		case 7:
		day = "Sunday";
		default:
		day = "Invalid day";
		}
		System.out.println(day);
	}

}
