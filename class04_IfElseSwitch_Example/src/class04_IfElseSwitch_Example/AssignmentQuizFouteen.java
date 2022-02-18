package class04_IfElseSwitch_Example;

public class AssignmentQuizFouteen {

	public static void main(String[] args) {
		int custAge;
		custAge =8;
		if(custAge>60) {
			System.out.println("tax will be 0%");
			if(custAge>70)
				System.out.println("no service charge");
			else {
				System.out.println("tax will be 10%");
				if(custAge<25) {
					System.out.println("service charge will be added");
					System.out.println("no discount");
					if(custAge>0 && custAge<=10)
						System.out.println("gift will be given");
				}
			}
		}

	}

}
