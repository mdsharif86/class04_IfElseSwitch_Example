package class04_IfElseSwitch_Example;

public class AssignmentQuizTen {

	public static void main(String[] args) {
		byte age;
		age = 15;
		if(age>63)
			System.out.println("Senior Citizen");
		else {
			System.out.println("Junior Citizen");
			if(age<12)
				System.out.println("baby");
			if(age>=12 && age<18)
				System.out.println("teen");
			if(age>=18)
				System.out.println("adult");
			if(age>=45)
				System.out.println("junior adult");
			if(age<45)
				System.out.println("senior adult");
		}

	}//main

}//class
