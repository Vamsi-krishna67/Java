import java.util.Scanner;


public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character: ");
		int Character = sc.next().charAt(0); 
		if (Character >=  'A' && Character <= 'Z' || Character >=  'a' && Character <= 'z') {
			System.out.println("The Character is ALPHABET");
		}
		else if (Character >= '0' && Character >=  '0') {
			System.out.println("The Character is NUMBER");
		}
		else {
			System.out.println("The Character is SYMBOL");
		}
    
    sc.close();
  }
}
