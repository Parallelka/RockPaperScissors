import java.util.Scanner;

public class User {
    private Selection move;

    public boolean doMove() {
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
        if (choose.equals("ROCK") || choose.equals("PAPER") || choose.equals("SCISSORS")) {
            move = Selection.valueOf(choose);
            return true;
        }

        return false;
    }

    public Selection getMove() {
        return move;
    }
}
