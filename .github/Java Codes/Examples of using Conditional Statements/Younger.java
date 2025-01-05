import java.util.Scanner;


public class Younger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("Enter the age of HERO1: ");
		int hero1 = sc.nextInt();
		System.out.print("Enter the age of HERO2: ");
		int hero2 = sc.nextInt();
		System.out.print("Enter the age of HERO3: ");
		int hero3 = sc.nextInt();
		if(hero1 < hero2 && hero1 < hero3){
			System.out.println("HERO1 is Younger");
		}
		else if(hero2 < hero1 && hero2 < hero3){
			System.out.println("HERO2 is Younger");
		}
		else {
			System.out.println("HERO3 is Younger");
		}
    
    sc.cloae();
  }
}
