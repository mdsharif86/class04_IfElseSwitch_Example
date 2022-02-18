package class04_IfElseSwitch_Example;

public class AssignmentQuizFifteen {

	public static void main(String[] args) {
		int custAge;
		custAge = 30;
		
		if(custAge>60) {
			System.out.println("tax will be 0%");
			if(custAge>70)
				System.out.println("no service charge");
				System.out.println("discount will be added");
		}
		else {
			System.out.println("tax will be 10%");
			if(custAge<25)
				System.out.println("service charge will be added");
			System.out.println("no discount");
		}
	}

}
