import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int count=0;
		for (int i=1;i<=num;i++ ) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2){
			System.out.println(num+ " is a prime number");
		}
		else {
			System.out.println(num+ " is a not a prime number");
		}
    sc.close();
  }
}
