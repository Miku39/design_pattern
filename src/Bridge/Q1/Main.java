public class Main {
    public static void main(String[] args) {
        RandomDisplay d = new RandomDisplay(new StringDisplayImpl("Hello, Japan."));
        d.randomDisplay(10);
    }
}
