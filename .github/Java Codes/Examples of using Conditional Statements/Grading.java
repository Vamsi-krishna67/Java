import java.util.Scanner;


public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		// print the grades of student accordign to their marks if marks >90 -> O, 80-90 -> A, 70-80 -> B, 40-70 -> C, <40 -> fail
		
		System.out.println("Enter the marks of student: ");
		int marks = sc.nextInt(); 
		if (marks>=90) {
			System.out.println("The student got Grade :O");
		}
		else if (marks >=80 && marks <90) {
			System.out.println("The student got Grade :A");
		}
		else if(marks >=70 && marks <80) {
			System.out.println("The student got Grade :B");
		}
		else if(marks >=40 && marks <70) {
			System.out.println("The student got Grade :C");
		}
		else if(marks<40) {
			System.out.println("The student got Grade :FAIL");
		}
		else {
			System.out.println("Entered Wrong Marks out of 100 ");
		}
    
    sc.close();
  }
}
