import java.util.Scanner;        

public class ScannerEg {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer value ");
		int num = sc.nextInt();
		
		System.out.println("Enter the name ");
		String name = sc.next();
		
		System.out.println("Enter the salary value ");
		float salary = sc.nextFloat();
		
		System.out.println("Enter the Double value ");
		double sample = sc.nextDouble();
	
		System.out.println("Enter the character value ");
		char Letter = sc.next().charAt(0);
			
		System.out.println("The number entered by user is :"+ num);
		System.out.println("The name entered by user is :"+ name);
		System.out.println("The salary entered by user is :"+ salary);
		System.out.println("The double entered by user is :"+ sample);
		System.out.println("The intialLetter entered by user is :"+ Letter);






    // Adding three numbers by taking the inputs from user 
    System.out.print("Enter the 1st Number: ");
		int num1 = sc.nextInt();
    System.out.print("\nEnter the 2nd Number: ");
		int num2 = sc.nextInt();
    System.out.print("\nEnter the 3rd Number: ");
		int num3 = sc.nextInt();

    int sum=num1+num2+num3;
    System.out.println("The Sum of 3 numbers "+ num1 + " + " + num2 + " + " + num3 + " is " + sum);


    
		
		sc.close();
	}

}
