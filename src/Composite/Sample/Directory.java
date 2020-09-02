import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                    // �f�B���N�g���̖��O
    private ArrayList directory = new ArrayList();      // �f�B���N�g���G���g���̏W��
    public Directory(String name) {         // �R���X�g���N�^
        this.name = name;
    }
    public String getName() {               // ���O�𓾂�
        return name;
    }
    public int getSize() {                  // �T�C�Y�𓾂�
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // �G���g���̒ǉ�
        directory.add(entry);
        return this;
    }
    protected void printList(String prefix) {       // �G���g���̈ꗗ
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
