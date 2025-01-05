import java.util.Scanner;

public class DownSidedTriangle {

	public static void main(String[] args) {
    		for(int i=5;i>=1;i--) {
			for(int s=5;s>=i-1;s--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		//output:
//				  543212345
//				   4321234
//				    32123
//				     212
//				      1

  }
}
