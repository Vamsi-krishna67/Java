import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int userGuess;
        
        // Do-while loop for the guessing game
        do {
            System.out.print("Guess the number (between 1 and 100): ");
            
            // Check if user input is valid
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number! Please try again.");
                scanner.next(); // Clear invalid input
            }
            userGuess = scanner.nextInt();
            
            if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the right number.");
            }
        } while (userGuess != targetNumber); // Loop until the user guesses the correct number
        
        scanner.close();
    }
}
