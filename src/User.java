import java.util.Scanner;

public class User {
    private Selection move;

    public void doMove() throws IllegalArgumentException {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please choose: ROCK (r), PAPER (p), SCISSORS (s)");
        String choose = inputScanner.nextLine().toUpperCase();
        switch (choose) {
            case "R":
                choose = "ROCK";
                break;
            case "P":
                choose = "PAPER";
                break;
            case "S":
                choose = "SCISSORS";
        }
        move = Selection.valueOf(choose);
    }

    public Selection getMove() throws IllegalStateException {
        if (move == null) {
            throw new IllegalStateException("The Move is not choose");
        }
        return move;
    }
}
