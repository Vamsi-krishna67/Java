import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		int c;
		c=b;
		b=a;
		a=c;
		System.out.println("after swapping a="+ a + "  b=" + b);
    
    sc.close();
  }
}
