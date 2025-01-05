import java.util.Scanner;

public class LeftUpTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    //1. print the pattern
//		for(int i=1;i<=5;i++) {
//			for(int s=i;s<=5;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//			
//		}

		
		//output:
//			      1
//			     12
//			    123
//			   1234
//			  12345
		
		
		//2. print the pattern
//		for (int i=1;i<=5;i++) {
//			for(int s=i;s<=5;s++) {
//				System.out.print(" ");
//			}
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//output:
//			      1
//			     21
//			    321
//			   4321
//			  54321
		
		
		//3.print the patter
//		for(int i=5;i>=1;i--) {
//			for(int s=i;s>=1;s--) {
//				System.out.print(" ");
//			}
//			for (int j=5;j>=i;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//output:
//			      5
//			     54
//			    543
//			   5432
//			  54321
		
		//4. print the pattern
//		for(int i=5;i>=1;i--) {
//			for(int s=1;s<i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=i;j<=5;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		
		//output:
//			     5
//			    45
//			   345
//			  2345
//			 12345
		
		//5.print the pattern
//		for(char i='A';i<='E';i++) {
//			for(char s='E';s>i;s--) {
//				System.out.print(" ");
//			}
//			for (char j='A';j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//output:
//			     A
//			    AB
//			   ABC
//			  ABCD
//			 ABCDE
		
		
		//6. print the pattern
//		for(char i='A';i<='E';i++) {
//			for(char s=i;s<'E';s++) {
//				System.out.print(" ");
//			}
//			for(char j=i;j>='A';j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//output:
//			     A
//			    BA
//			   CBA
//			  DCBA
//			 EDCBA

      //7. print the pattern
//		for(char i='A';i<='E';i++) {
//			for(char s=i;s<'E';s++) {
//				System.out.print(" ");
//			}
//			for(char j=i;j>='A';j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

      //output:
//				     *
//				    **
//				   ***
//				  ****
//				 *****
 }
}
