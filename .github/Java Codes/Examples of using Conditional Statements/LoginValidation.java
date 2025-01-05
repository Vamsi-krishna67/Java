import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    // Check login validation 
		System.out.println("Enter the Username: ");
		String Uname = sc.next();
		if(Uname.equals("Hero")) {
			System.out.println("Enter the Password: ");
			String Password = sc.next();
			
			if(Password.equals ("Hero@123")) {
				System.out.println("You Have Successfully login");
			}
			else {
				System.out.println("Wrong Password");
			}
		}
		else {
			System.out.println("Wrong Credentials");
		}
    
    sc.close();
  }
}
