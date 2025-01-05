import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.print("Enter a 3 digit number: ");
		int i=sc.nextInt();
		int n=i;
		int sum=0;
		while(i>0) {
			int ld=i%10;
			int cube=ld*ld*ld;
			sum=sum+cube;
			i=i/10;
		}
		if(sum==n) {
			System.out.println("Given number "+n+" is Armstrong");
		}
		else {
			System.out.println("Given number "+n+" is Not Armstrong");
		}
    sc.close();
  }
}
