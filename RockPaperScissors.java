import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] options = {"Rock", "Paper", "Scissors"};
            boolean playAgain = true;

            System.out.println("Welcome to Rock-Paper-Scissors!");

            while (playAgain) {
                System.out.println("\nChoose: Rock, Paper, or Scissors (or type 'exit' to quit):");
                String userChoice = scanner.nextLine().trim().toLowerCase();

                if (userChoice.equals("exit")) {
                    playAgain = false;
                    System.out.println("Thanks for playing!");
                    continue;
                }

                int computerChoiceIndex = random.nextInt(3);
                String computerChoice = options[computerChoiceIndex].toLowerCase();

                if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                    System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
                    continue;
                }

                System.out.println("Computer chose: " + options[computerChoiceIndex]);

                // Determine the winner
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }

            scanner.close();
        }
    }