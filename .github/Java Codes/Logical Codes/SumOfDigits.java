import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum+ number % 10;  
            number = number/10;        
        
        }
        System.out.println("Sum of digits: " + sum);

    sc.close();
  }
}
