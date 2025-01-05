import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int s=i;s<5;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
				
			}
			
			System.out.println();
		}
		for(int i2=4;i2>=1;i2--) {
			for(int s1=5;s1>=i2+1;s1--) {
				System.out.print(" ");
			}
			for(int j1=1;j1<=i2;j1++) {
				System.out.print(j1);
			}
			for(int k1=i2-1;k1>=1;k1--) {
				System.out.print(k1);
			}
			System.out.println();
		}
  }
}
		
		
		
		//output:
//			     1
//			    121
//			   12321
//			  1234321
//			 123454321
//			  1234321
//			   12321
//			    121
//			     1
    

  
