import java.util.Scanner;

public class RockPaperScissors {
    public RockPaperScissors() {

    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String choose = "Y";
        while (choose.equals("Y")) {
            game();
            System.out.println("Play again? (y/n)");
            choose = inputScanner.nextLine().toUpperCase();
        }
    }

    private static void game() {
        Game game = new Game(3);
        User user = new User();
        Computer computer = new Computer();
        while (!game.isGameOver()) {
            computer.doMove();
            int i = 0;
            while (!user.doMove()) {
                i++;
                System.out.println("Wrong answer (try " + i + " of 3)");
                if (i > 2) {
                    return;
                }
            }
            computer.showMove();
            game.round(computer.getMove(), user.getMove());
            game.showScores();
        }
        game.showWinner();
    }
}
