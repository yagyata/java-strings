import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // Method to get the computer's choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) return "Draw";
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        int userWins = 0, computerWins = 0;
        System.out.println("Game Start!");
        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }

        System.out.println("\nResults:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + (numGames - userWins - computerWins));

        double userWinPercent = (double) userWins / numGames * 100;
        double computerWinPercent = (double) computerWins / numGames * 100;
        System.out.printf("User Win Percentage: %.2f%%\n", userWinPercent);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercent);
    }
}
