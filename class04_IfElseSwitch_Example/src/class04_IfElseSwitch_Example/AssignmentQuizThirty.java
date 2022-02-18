package class04_IfElseSwitch_Example;

public class AssignmentQuizThirty {

	public static void main(String[] args) {
		//write a code that determine the largest among three number
		int a, b , c; //variable declaration
		a= 10;
		b = 9;
		c = 12;
		
		if(a>b) {
			System.out.println(a);
			if(a>c)
				System.out.println(c);
		}
		else {
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}//main

}//class
