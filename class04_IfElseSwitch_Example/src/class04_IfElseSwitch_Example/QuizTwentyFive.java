package class04_IfElseSwitch_Example;

public class QuizTwentyFive {

	public static void main(String[] args) {
		char operator;
		 double number1, number2, result;
		 operator = '+';
		 number1 = 3.0;
		 number2 = 4.0;
		 switch (operator) {
		 // performs addition between numbers
		 case '+':
		 result = number1 + number2;
		 System.out.print(number1 + "+" + number2 + " = " + result);
		 break;
		 // performs subtraction between numbers
		 case '-':
		 result = number1 - number2;
		 System.out.print(number1 + "-" + number2 + " = " + result);
		 break;
		 // performs multiplication between numbers
		 case '*':
		 result = number1 * number2;
		 System.out.print(number1 + "*" + number2 + " = " + result);
		 break;
		 // performs division between numbers
		 case '/':
		 result = number1 / number2;
		 System.out.print(number1 + "/" + number2 + " = " + result);
		 break;
		 default:
		 System.out.println("Invalid operator!");
		 break;
		 }
	}

}
