import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop to validate input
        do {
            System.out.print("Enter a positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number! Please try again.");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();
        } while (number <= 0); // Continue asking until a positive number is entered

        System.out.println("You entered a valid positive number: " + number);
        scanner.close();
    }
}
