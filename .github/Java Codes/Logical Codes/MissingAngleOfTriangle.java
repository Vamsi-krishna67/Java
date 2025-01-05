import java.util.Scanner;

public class MissingAngleOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st angle: ");
		double angle1 = sc.nextDouble();
		System.out.print("Enter the 2nd angle: ");
		double angle2 = sc.nextDouble();
		
		double angle3= 180 - (angle1+angle2) ;
		System.out.println("The missing angle of the triangle is "+angle3);
    sc.close();
  }
}
