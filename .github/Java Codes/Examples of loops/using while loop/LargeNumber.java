import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
		int i=sc.nextInt();
		int large=0;
		while(i!=0) {
			int ld=i%10;
			if(ld>large) {
				large=ld;
			}
			i=i/10;			
		}
		System.out.println(large);
    sc.close();
  }
}
