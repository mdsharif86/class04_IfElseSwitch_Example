package class04_IfElseSwitch_Example;

public class Assignment49 {

	public static void main(String[] args) {
		int student;
		student =  60;
		
		if(student > 90)
			System.out.println("he is getting 100% marks");
		else if(student > 75) {
			System.out.println("qualified for exam");
			System.out.println("obtain 75% marks");
		}	
		else if( student < 65 ) {
			System.out.println("send applicaltion for exam");
			System.out.println("getting 65% marks");
		}		
		else
			System.out.println("he is not qualified");

	}//main

}//class
