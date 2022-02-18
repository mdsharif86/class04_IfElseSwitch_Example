package class04_IfElseSwitch_Example;

public class QuizTwentysix {

	public static void main(String[] args) {
		int choice=20, operand1=20, operand2=10;
		int sum;
		switch(choice) {
		case 10:
		sum=operand1+operand2;
		System.out.println("Addition od two numbers is ="+sum);
		break;
		case 20:
		sum=operand1
		-operand2;
		System.out.println("Subtraction of two numbers is ="+sum);
		break;
		case 30:
		sum=operand1*operand2;
		System.out.println("Multiplication of two numbers is ="+sum);
		break;
		case 40:
		sum=operand1/operand2;
		System.out.println("Division of two numbers is ="+sum);
		break;
		case 50:
		sum=operand1%operand2;
		System.out.println("Modulus of two numbers is ="+sum);
		break;
		default:
		System.out.println("Not in the following cases");	

		}//switch
		

	}//main
}//class