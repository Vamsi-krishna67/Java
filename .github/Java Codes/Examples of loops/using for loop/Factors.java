import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to get the factors: ");
		int num=sc.nextInt();
		int count=0;
		for (int i=1;i<=num;i++ ) {
			if(num%i==0) {
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.print("   are the factors of "+num);
		System.out.println("\nTotally there are "+count+" factor for "+num);
    sc.close();
  }
}
