public class Main {
    public static void main(String[] args) {
        IncreaseDisplay d = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'));
        d.increaseDisplay(4);

        IncreaseDisplay d2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'));
        d2.increaseDisplay(6);
    }
}
