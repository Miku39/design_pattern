package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private Map<Integer, String> database = new HashMap<>();
    private int serial = 0;
    // マルチスレッドで動作させた時に、異なるインスタンスに同じ通し番号がつくのを防ぐ為
    // synchronizedにしている
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }
    public Map getDatabase() {
        return database;
    }
}
