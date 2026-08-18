import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class rock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"ROCK", "PAPER", "SCISSOR"};

        System.out.print("Enter choice (Rock, Paper, Scissor): ");
        String player = scanner.nextLine().toUpperCase(Locale.ROOT);

        String computer = choice[random.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if (player.equals(computer)) {
            System.out.println("TIE");
        }
        else if (
                (player.equals("ROCK") && computer.equals("SCISSOR")) ||
                        (player.equals("PAPER") && computer.equals("ROCK")) ||
                        (player.equals("SCISSOR") && computer.equals("PAPER"))
        ) {
            System.out.println("YOU WIN!");
        }
        else {
            System.out.println("COMPUTER WINS!");
        }

        scanner.close();
    }
}