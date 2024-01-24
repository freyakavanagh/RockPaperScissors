import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

    static Scanner scanner = new Scanner(System.in);

    public static String computersChoice() {

        Random random = new Random();

        int randomNumber = random.nextInt(3) + 1;

        if (randomNumber == 1) {
            return "rock";
        } else if (randomNumber == 2) {
            return "paper";
        } else return "scissors";

    }

    public static void playGame() {

        System.out.println("rock, paper, scissors... shoot!");

        String playersChoice = scanner.nextLine();

        String computersChoice = computersChoice();

        System.out.println("You chose " + playersChoice + ".\nI chose " + computersChoice+".");

        decideWinner(playersChoice, computersChoice);

    }

    public static void decideWinner(String playersChoice, String computersChoice) {

        if (Objects.equals(playersChoice, computersChoice)) {
            System.out.println("\nA draw!");
        } else if (playersChoice.equals("scissors") && computersChoice.equals("rock") || playersChoice.equals("rock") && computersChoice.equals("paper")) {
            System.out.println("I win! Better luck next time.");
        } else System.out.println("You win!");

    }


    public static void main(String[] args) {

        do {
            System.out.println("Do you want to play?");
            if (scanner.nextLine().equals("yes")) {
                System.out.println("Great");
                playGame();
                System.out.println("\nThanks for playing!");
            } else {
                System.out.println("Next time then!");
                break;
            }
        } while (true);
    }
}








