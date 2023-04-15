import java.util.Random;

public class Computer {
    private Selection move;
    private final Random random = new Random();

    public void doMove() {
        Selection[] moves = Selection.values();
        int index = random.nextInt(moves.length);
        move = moves[index];
    }

    public Selection getMove() {
        return move;
    }
    public void showMove() {
        System.out.println("Computer choose: " + move);
    }
}

