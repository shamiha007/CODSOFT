package taskone;

import java.util.Random;
import java.util.Scanner;

public class taskone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        int score = 0;
        int level = 1;
        System.out.println("guess the number game made by shamiha sherin");
        
        while (true) {
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = maxAttempts - level + 1;
            boolean hasWon = false;
            
            System.out.println("Level " + level + ": Guess the number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts left.");
            
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    score += attemptsLeft; // More attempts left means a higher score
                    hasWon = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }
            
            if (!hasWon) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
            }
            
            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again (yes/no)? ");
            String playAgain = scanner.next();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing! Your final score is: " + score);
                break;
            }
            
            level++;
        }
        scanner.close();
    }
}

