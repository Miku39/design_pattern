import java.util.Random;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int plus;

    private int number; // 現在の数

    IncrementalNumberGenerator(int start, int end, int plus) {
        this.start = start;
        this.end = end;
        this.plus = plus;
    }

    public int getNumber() { // 数を取得する
        return number;
    }

    public void execute() {
        for (int i = start; i < end; i = i + plus) {
            number = i;
            notifyObservers();
        }
    }
}
