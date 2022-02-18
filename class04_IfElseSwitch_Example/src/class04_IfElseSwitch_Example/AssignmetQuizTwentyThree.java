package class04_IfElseSwitch_Example;

public class AssignmetQuizTwentyThree {

	public static void main(String[] args) {
		int custAge;
		custAge =25;
		
		if(custAge>50)
			System.out.println("tax will be 0%");
		else {
			System.out.println("tax will be 10%");
			if(custAge<40)
				System.out.println("service charge will be added");
		}

	}//main

}//class
