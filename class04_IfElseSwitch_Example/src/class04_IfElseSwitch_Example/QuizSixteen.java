package class04_IfElseSwitch_Example;

public class QuizSixteen {

	public static void main(String[] args) {
	int weather =2;
		//passing variable to the switch
		switch (weather) {
		//comparing value of varable against each case
		case 0:
			System.out.println("It is a Sunny Today");
			break;
		case 1:
			System.out.println("It is Rainning today");
			break;
		case 3:
			System.out.println("It is Cloudy today");
			break;
			//optional
			default:
			System.out.println("Invalid Input!");
		
		}
}//class
}//class