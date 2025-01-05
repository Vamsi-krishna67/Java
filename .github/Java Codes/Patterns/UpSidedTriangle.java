import java.util.Scanner;

public class UpSidedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    //1. print the pattern
//		for (int i=1;i<=5;i++) {
//			for(int s=i;s<=5;s++) {
//				System.out.print(" ");
//			}
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//				
//			}
//			for(int k=2;k<=i;k++) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		//output:
//			      1
//			     212
//			    32123
//			   4321234
//			  543212345

		
		//2. print the pattern
//		for(int i=1;i<=5;i++) {
//			for(int s=i;s<5;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int k=i-1;k>=1;k--) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		//output:
//				     1
//				    121
//				   12321
//				  1234321
//				 123454321

	  //3. print the pattern
//		for(int i=5;i>=1;i--) {
//			for(int s=1;s<i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=5;j++){
//				System.out.print(j);
//			}
//			for(int k=4;k>=i;k--) {
//				System.out.print(k);
//			}
//			System.out.println();
//		}
		
		//output:
//			     5
//			    454
//			   34543
//			  2345432
//			 123454321

    
		//4. print the pattern
//		for(int i=1;i<=5;i++) {
//			for(int s=i;s<5;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int k=i-1;k>=1;k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//output:
//			     *
//			    ***
//			   *****
//			  *******
//			 *********
  }
}
