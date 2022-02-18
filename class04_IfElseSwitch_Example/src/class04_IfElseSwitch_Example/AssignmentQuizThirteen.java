package class04_IfElseSwitch_Example;

public class AssignmentQuizThirteen {

	public static void main(String[] args) {
		int getMarks;
		getMarks = 50;
		
		if(getMarks<40) {
			System.out.println("you are fail");
		}
		else if (getMarks>40 && getMarks<=50) {
			System.out.println("grade d");
	}
	else if (getMarks>=50 && getMarks<60) {
		System.out.println("grade C");
	}
		else
			System.out.println("not correct");
	}//main

}//class
