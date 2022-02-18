package class04_IfElseSwitch_Example;

public class QuizSeventeen {

	public static void main(String[] args) {
		int weather = 0;
		//passing variable to the switch
		switch (weather)
		{
		//comparing value of variable against each case
		case 0:
		System.out.println("It is Sunny today!");
		case 1:
		System.out.println("It is Raining today!");
		case 2:
		System.out.println("It is Cloudy today!");
		//optional
		default:
		System.out.println("Invalid Input!");

	}

}//class
}//class