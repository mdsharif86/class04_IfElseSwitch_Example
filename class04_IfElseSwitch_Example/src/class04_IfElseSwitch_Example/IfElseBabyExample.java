package class04_IfElseSwitch_Example;

public class IfElseBabyExample {

	public static void main(String[] args) {
	
		int grade;
		grade = 30;
		if(grade>80) {
			System.out.println("A");
		}//if
		else if (grade>=60 && grade<=80) {
			System.out.println("B");
		}//if
		else {
			System.out.println("F");
		}//if
	}//main

}//class
