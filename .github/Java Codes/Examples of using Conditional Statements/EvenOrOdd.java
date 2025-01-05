import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    // check the given number is even or odd if it is positive
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n>0) {
			if(n%2 == 0) {
				System.out.println("The given number is POSITIVE EVEN");
			}
			else {
				System.out.println("The given number is POSITIVE ODD");
			}
		}
		else {
			System.out.println("The given number is NEGATIVE");
		}
    
    sc.close();
  }
}
