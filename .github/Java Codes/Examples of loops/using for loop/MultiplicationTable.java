import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to get multiplication table: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + (num*i));	
		}
    
    sc.close();
  }
}