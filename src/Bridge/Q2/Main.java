public class Main {
    public static void main(String[] args) {
        Display d = new Display(new FileDisplayImpl("Q2.txt"));
        d.display();
    }
}
