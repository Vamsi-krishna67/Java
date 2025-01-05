import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color");
		String color=sc.next();
		switch(color){
		
		case "orange":
			System.out.println("Please be patient and WAIT");
			break;
			
		case "red":
			System.out.println("Please be patient and STOP");
			break;
			
		case "green":
			System.out.println("You can GO");
			break;
			
		default:
			System.out.println("WRONG COLOR");
			break;	
		}
    sc.close();
  }
}
    
