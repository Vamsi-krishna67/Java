import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second nummber: ");
		int num2=sc.nextInt();
		int result;
		System.out.println("Enter the operator you want to perform");
		char operator=sc.next().charAt(0);
		switch(operator){
		case '+':
			result = num1+num2;
			System.out.println("Sum of two numbers " + num1 + operator + num2 + "=" + result);
			break;
		case '-':
			result = num1-num2;
			System.out.println("Difference of two numbers " + num1 + operator + num2 + "=" + result);
			break;
		case '*':
			result = num1*num2;
			System.out.println("Multiplication of two numbers " + num1 + operator + num2 + "=" + result);
			break;
		case '/':
			result = num1/num2;
			System.out.println("Division of two numbers " + num1 + operator + num2 + "=" + result);
			break;
		case '%':
			result = num1%num2;
			System.out.println("Remainder of two numbers " + num1 + operator + num2 + "=" + result);
			break;
		default:
			System.out.println("ENTERED WRONG OPERATOR");
			break;	
		}
    
    sc.close();
  }
}
