package class04_IfElseSwitch_Example;

public class AssignmentQuizTwetyTwo {

	public static void main(String[] args) {
		int month=6;
		
		if(month==12 || month ==1 || month ==2)
			System.out.println("winter");
		else if (month==3 || month ==4 || month ==5)
			System.out.println("summer");
		else if (month==6 || month ==7 || month ==8)
			System.out.println("autumn");
		else
			System.out.println("extra");

	}//main

}//class
