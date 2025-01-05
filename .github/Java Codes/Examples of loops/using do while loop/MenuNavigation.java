import java.util.Scanner;

public class MenuNavigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Do-while loop to display menu until user selects "exit"
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            // Validate user input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // Loop until the user selects "Exit"

        scanner.close();
    }
}
