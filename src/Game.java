public class Game {
    private int scoreComputer;
    private int scoreUser;
    private final int scoreMax;

    public Game(int scoreMax) {
        this.scoreMax = scoreMax;
    }

    public boolean isGameOver() {
        return scoreUser >= scoreMax || scoreComputer >= scoreMax;
    }

    public void round(Selection computerMove, Selection userMove) {
        if (computerMove == userMove) {
            return;
        }
        if (computerMove == Selection.ROCK && userMove == Selection.SCISSORS
                || computerMove == Selection.PAPER && userMove == Selection.ROCK
                || computerMove == Selection.SCISSORS && userMove == Selection.PAPER) {
            scoreComputer++;
        } else {
            scoreUser++;
        }
    }
    public void showWinner() {
        if (scoreUser > scoreComputer) {
            System.out.println("You win!!!");

        } else if (scoreComputer > scoreUser) {
            System.out.println("You lose :(");
        } else {
            System.out.println("Draw :)");
        }
    }

    public void showScores() {
        System.out.println("Computer " + scoreComputer + " : " + scoreUser + " User");
    }
}
