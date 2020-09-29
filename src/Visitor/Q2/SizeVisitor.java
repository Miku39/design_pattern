import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public void visit(File file) { // ファイルを訪問したときに呼ばれる
        size += file.getSize();
    }

    public void visit(Directory directory) { // ディレクトリを訪問したときに呼ばれる
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
}
