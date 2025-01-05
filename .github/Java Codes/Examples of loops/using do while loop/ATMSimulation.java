import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Initial balance
        int choice;

        // Do-while loop to simulate ATM menu until the user exits
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid option.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. Your new balance is: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4); // Loop until the user selects "Exit"

        scanner.close();
    }
}
