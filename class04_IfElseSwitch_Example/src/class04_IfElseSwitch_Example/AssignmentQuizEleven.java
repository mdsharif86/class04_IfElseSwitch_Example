package class04_IfElseSwitch_Example;

public class AssignmentQuizEleven {

	public static void main(String[] args) {
		int istNumber =20;
		int secNumber =10;
		int thirdNumber =30;
		
		if( istNumber<=secNumber && istNumber<=thirdNumber)
			System.out.println(istNumber);
		else if (secNumber<=istNumber && secNumber<=thirdNumber)
			System.out.println(secNumber);
		else 
			System.out.println(thirdNumber);

	}

}
