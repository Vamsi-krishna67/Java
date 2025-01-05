import java.util.Scanner;


public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    //  check the given number is positive or negative or zero
		System.out.println("Enter the Number: ");
		int num = sc.nextInt(); 
		if (num>0) {
			System.out.println("The number is POSITIVE");
		}
		else if (num<0) {
			System.out.println("The number is NEGATIVE");
		}
		else {
			System.out.println("The number is ZERO");
		}
    
    sc.close();
  }
}
