import java.util.Scanner;


public class UpperOrLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character: ");
		int Character = sc.next().charAt(0); 
		if (Character >=  'A' && Character <= 'Z' ) {
			System.out.println("The Character is UPPER CASE ");
		}
		else if (Character >=  'a' && Character <= 'z') {
			System.out.println("The Character is LOWER CASE");
		}
		else {
			System.out.println("The Character is NOT AN ALPHABET");
		}
    
    sc.close();
  }
}
