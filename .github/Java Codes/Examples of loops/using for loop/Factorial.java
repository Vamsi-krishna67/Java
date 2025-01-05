import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
  		// Find the factorial at given numbers
		System.out.print("Enter the number to find factorial: ");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+num +" is :"+ fact);
    
    sc.close();
  }
}
