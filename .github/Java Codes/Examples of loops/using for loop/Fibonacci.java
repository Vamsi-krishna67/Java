import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the initial 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the number of elements to print fibonacci series");
		int n=sc.nextInt();
		int c;
		for(int i=1;i<=n;i++) {
			System.out.print("  "+a);
			c=a+b;
			a=b;
			b=c;
		}
    sc.close();
  }
}
