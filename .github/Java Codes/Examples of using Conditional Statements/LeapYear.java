import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    // check the year is leap year or not
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if(year%400 == 0) {
			System.out.println(year+" is leap year");
		}
		else if(year%4 == 0 && year%100 != 0) {
			System.out.println(year+" is leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
    
    sc.close();
  }
}
