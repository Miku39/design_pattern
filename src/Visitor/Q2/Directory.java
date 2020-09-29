import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name; // ディレクトリの名前
    private ArrayList dir = new ArrayList(); // ディレクトリエントリの集合

    public Directory(String name) { // コンストラクタ
        this.name = name;
    }

    public String getName() { // 名前を得る
        return name;
    }

    public int getSize() { // サイズを得る
        SizeVisitor v = new SizeVisitor();
        accept(v);
        return v.getSize();
    }

    public Entry add(Entry entry) { // エントリの追加
        dir.add(entry);
        return this;
    }

    public Iterator iterator() { // Iteratorの生成
        return dir.iterator();
    }

    public void accept(Visitor v) { // 訪問者の受け入れ
        v.visit(this);
    }
}
