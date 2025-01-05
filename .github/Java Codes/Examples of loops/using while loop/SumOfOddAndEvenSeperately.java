import java.util.Scanner;

public class SumOfOddAndEvenSeperately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
		int j=n;
		int sum1=0;
		int sum2=0;
		while(n!=0) {
			int ld=n%10;
			if(ld%2!=0) {
				sum1=sum1+ld;
			}
			if(ld%2==0) {
				sum2=sum2+ld;
			}
			n=n/10;
		}
		System.out.println("The sum of odd digits in  "+ j+" is "+sum1);
		System.out.println("The sum of even digits in  "+ j+" is "+sum2);
    sc.close();
  }
}
