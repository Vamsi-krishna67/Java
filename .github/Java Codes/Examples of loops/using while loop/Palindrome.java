import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
		int i=sc.nextInt();
		int com=i;
		int rev=0;
		while(i!=0) {
			int ld=i%10;
			rev = rev*10+ld;
			i=i/10;
		}
		if(rev == com) {
			System.out.println("Given number "+ com +" is Palindrome");
		}
		else {
			System.out.println("Given number "+ com +" is not Palindrome");
		}
    sc.close();
  }
}
