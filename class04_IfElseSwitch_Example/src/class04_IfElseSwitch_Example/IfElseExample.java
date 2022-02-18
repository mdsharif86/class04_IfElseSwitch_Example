package class04_IfElseSwitch_Example;

public class IfElseExample {

	public static void main(String[] args) {
		int age;
		age = 18;
		if ( age <19 ) {
			System.out.println("No Tax");
		}//if
		
		else if ( age >=18 && age < 63) {
			System.out.println("Tax will apply");
			System.out.println("Tax = 8.5");
		}//if
		else
			System.out.println("Tax = 2%");
		
	}//main

}//class
