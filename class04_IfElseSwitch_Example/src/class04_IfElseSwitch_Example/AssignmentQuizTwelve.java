package class04_IfElseSwitch_Example;

public class AssignmentQuizTwelve {

	public static void main(String[] args) {
		byte age;
		age = 55;
		if(age>63)
			System.out.println("senior citizen");
		else {
			System.out.println("junior citizen");
			if(age<12)
				System.out.println("baby");
			if(age>=12 && age<18)
				System.out.println("teen");
			if(age>=18) {
				System.out.println("adult");
				if(age>=45)
					System.out.println("Junior adult");
				if(age<45)
					System.out.println("senior adult");
			}
		}
	}

}
