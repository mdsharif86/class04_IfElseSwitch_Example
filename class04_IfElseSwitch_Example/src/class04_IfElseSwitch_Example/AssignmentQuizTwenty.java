package class04_IfElseSwitch_Example;

public class AssignmentQuizTwenty {

	public static void main(String[] args) {
		int myValue =1;
		int myNumber =0;
		switch (myValue) {
		case 2:
			myNumber += 6;
		case 4:
			myNumber += 1;
		default:
			myNumber += 2;
		case 0:
			myNumber += 4;
			
		}
		System.out.println("myNumber = " + myNumber);
	}//main

}//class
