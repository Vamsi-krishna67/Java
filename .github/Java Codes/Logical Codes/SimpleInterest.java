import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principle amount: ");
		double PrincipleAmount = sc.nextDouble();
		System.out.println("Enter Time Duration: ");
		float Time = sc.nextFloat();
		System.out.println("Enter the rate of interest: ");
		float Interest = sc.nextFloat();
		
		double SimpleInterest= (PrincipleAmount*Time*Interest)/100;
		System.out.println("Simple Interest = "+ SimpleInterest);
  }
}
