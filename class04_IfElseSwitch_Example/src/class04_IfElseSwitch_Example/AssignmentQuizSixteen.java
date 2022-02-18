package class04_IfElseSwitch_Example;

public class AssignmentQuizSixteen {

	public static void main(String[] args) {
		int custAge;
		custAge = 65;
		
		if(custAge>50) {
			System.out.println("yax will be 0%");
			if(custAge>60) {
				System.out.println("no service charge");
				System.out.println("discount will be added");
				
			}
		}
		else {
			System.out.println("tax will be 10%");
			if(custAge<40)
				System.out.println("service charge will be addes");
		}
	}//main

}//class
