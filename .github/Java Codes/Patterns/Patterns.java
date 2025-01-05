import java.util.Scanner;

public class PatternsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    		//1. print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		// output;
//				1234567
//				1234567
//				1234567
//				1234567
//				1234567
//				1234567
//				1234567
		
		//2.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1 || i==4 || i==7) {
//					System.out.print("*"+" ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		//output:
//				* * * * * * * 
//			       
//			       
//				* * * * * * * 
//				       
//				       
//				* * * * * * * 
		
		
		
		//3. print the pattern 
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(j==1 || j==4 || j==7) {
//					System.out.print("*"+ " ");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//output:
//					*   *   * 
//					*   *   * 
//					*   *   * 
//					*   *   * 
//					*   *   * 
//					*   *   * 
//					*   *   * 
		
		// 4.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==4 || j==6) {
//					System.out.print(" *");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//output:
//					     *  
//					     *  
//					     *  
//					* * * * * * * 
//					     *  
//					     *  
//					     *  

		
		
		//5.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1 || i==4 || i==7 || j==1 || j==4 || j==7) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		// output:
//					*******
//					*  *  *
//					*  *  *
//					*******
//					*  *  *
//					*  *  *
//					*******
		



		//6.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==4 || j==4 || i==1 && j<=4|| i==7 && j>=4 || j==1 && i>=4 || j==7 && i<=4) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//output:
//				****  *
//				   *  *
//				   *  *
//				*******
//				*  *   
//				*  *   
//				*  ****
		
		

		//7.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==4 || j==4 || i==1 && j>=4|| i==7 && j<=4 || j==1 && i<=4 || j==7 && i>=4) {
//					System.out.print("*");
//				
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println("");
//		}
		
		//output:
//				*  ****
//				*  *   
//				*  *   
//				*******
//				   *  *
//				   *  *
//				****  *

		
		
		//8.print the pattern 
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1 && j==1 || i==2 && j==2|| i==3 && j==3 || i==4 && j==4 || i==5 &&j==5 || i==6 && j==6 || i==7 && j==7) {
//					System.out.print("*");
//				
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println("");
//		}
		
		// or
		
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==j) {
//					System.out.print("*");
//				
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println("");
//		}
		
		//output:
//					*      
//					 *     
//					  *    
//					   *   
//					    *  
//					     * 
//					      *
		
		
		// 9.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i+j==8 ) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//output:
//				       *
//				      * 
//				     *  
//				    *   
//				   *    
//				  *     
//				 *      
		
		
		
		
		//10.print the pattern
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==j || i+j==8 ) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//output:
//				*     *
//				 *   * 
//				  * *  
//				   *   
//				  * *  
//				 *   * 
//				*     *

		
//		11.print the pattern
//		System.out.print("Enter the number: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j || i+j==n+1 || i==1 || i==((n/2)+1) || i==n || j==1 || j==((n/2)+1) || j==n) {
//					System.out.print("*  ");
//					
//				}
//				else {
//					System.out.print("   ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//output:
//				Enter the number: 15
//								*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  
//								*  *                 *                 *  *  
//								*     *              *              *     *  
//								*        *           *           *        *  
//								*           *        *        *           *  
//								*              *     *     *              *  
//								*                 *  *  *                 *  
//								*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  
//								*                 *  *  *                 *  
//								*              *     *     *              *  
//								*           *        *        *           *  
//								*        *           *           *        *  
//								*     *              *              *     *  
//								*  *                 *                 *  *  
//								*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  
								
		
		
		//12.print the pattern
		
//		System.out.print("Enter the number: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==j && i<=n/2+1 || i+j==n+1 && i<=n/2+1 || (j==((n/2)+1) && i>n/2) ) {
//					System.out.print("* ");
//					
//				}
//				else {
//					System.out.print("   ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		//output:
//				Enter the number: 9
//								*                      * 
//								   *                *    
//								      *          *       
//								         *    *          
//								            *             
//								            *             
//								            *             
//								            *             
//								            *             
		
		

		
		//13.print the pattern

//		System.out.print("Enter the number of rows: ");
//		int n1=sc.nextInt();
//		System.out.print("Enter the number of columns: ");
//		int n2=sc.nextInt();
//		System.out.println("output starts here: ");
//		for(int i=1;i<=n1;i++) {
//			for(int j=1;j<=n2;j++) {
//				if(i== (n1/2)-1 || i== (n1/2)+2 || i+j==(n2/2)+2 || j-i==n2/2 || i-j==(n1/2)-1 || i+j==n1+((n2/2)+1)) {
//					System.out.print("* ");
//					
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
	//output:
		
//				Enter the number of rows: 11
//				Enter the number of columns: 13
//				output starts here: 
//				            *             
//				          *   *           
//				        *       *         
//				* * * * * * * * * * * * * 
//				*   *               *   * 
//				  *                   *   
//				* * * * * * * * * * * * * 
//				      *           *       
//				        *       *         
//				          *   *           
//				            *     



    sc.close();


  }
}

		
		
		
