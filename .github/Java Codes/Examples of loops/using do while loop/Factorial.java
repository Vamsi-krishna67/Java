import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop for repeated factorial calculation
        do {
            System.out.print("Enter a number to calculate its factorial (enter 0 to exit): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
            number = scanner.nextInt();

            if (number > 0) {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is: " + factorial);
            } else if (number < 0) {
                System.out.println("Please enter a positive number.");
            }

        } while (number != 0); // Exit the loop when the user enters 0

        System.out.println("Exiting... Thank you!");
        scanner.close();
    }
}
