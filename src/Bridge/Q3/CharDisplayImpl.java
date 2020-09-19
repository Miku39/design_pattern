public class CharDisplayImpl extends DisplayImpl {
    private char start;
    private char main;
    private char end;

    public CharDisplayImpl(char start, char main, char end) {
        this.start = start;
        this.main = main;
        this.end = end;
    }

    public void rawOpen() {
        System.out.print(start);
    }

    public void rawPrint() {
        System.out.print(main);
    }

    public void rawClose() {
        System.out.println(end);
    }
}
