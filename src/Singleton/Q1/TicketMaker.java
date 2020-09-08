public class TicketMaker {
    private int ticket = 1000;
    // 唯一のインスタンス
    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
        System.out.println("インスタンスを生成しました。");
    }
    
    public static TicketMaker getInstance() {
        return singleton;
    }

    // 複数のスレッドから呼び出されても正しく動くようにするため
    // synchronizedをつけている
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
